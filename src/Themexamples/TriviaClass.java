package Themexamples;
import java.util.*;
import java.io.*;

// read a file with trivia data
// ask a user the questions
// score the test and return the test score

public class TriviaClass {
    // things we need for this task
    private String[] correctAnswers;
    private String[] usersAnswers;
    private int numberQs;
    private Scanner userinput;
    private Scanner fileinput;

    //constructor without parameter
    public TriviaClass(){
        System.out.println("no file input given!");
        System.exit(0);
    }

    //constructor with parameters

    public TriviaClass(String filename) throws IOException{
        //instantiating the needed things
        File triviafile = new File(filename);
        this.userinput = new Scanner(System.in);

        if(!triviafile.exists()){
            System.out.println("file doesnt exist!");
            System.exit(0);
        }

        this.fileinput = new Scanner(triviafile);
        numberQs = fileinput.nextInt();

        correctAnswers = new String[numberQs];
        for(int i = 0; i < numberQs; i++){
            correctAnswers[i] = fileinput.next();
        }

        usersAnswers = new String[numberQs];
        fileinput.nextLine();
    }


    public void giveTest(){

        System.out.println("answer the following questions true t or false f");
        for(int i = 0; i<numberQs; i++){
            System.out.println("Question " +(i+1)+"." + fileinput.nextLine());
            System.out.print("Answer ");
            usersAnswers[i] = userinput.next().toUpperCase();
        }
        System.out.println("You scored " + scoreTest() + " Percent");
        printResults();
        fileinput.close();


    }

    private int scoreTest(){
        int corr = 0;
        for(int i=0; i < numberQs; i++){
            if(usersAnswers[i].equals(correctAnswers[i])){
                corr++;
            }
        }
        return Math.round(100*corr/numberQs);
    }

    public void printResults(){
        System.out.println("Your answer: \t Correct Answer:");
        for (int i = 1; i < numberQs; i++){
            System.out.println((i + 1)+ ".\t " + usersAnswers[i] + "\t\t " + correctAnswers[i]);

        }
    }

    public static void main(String[] args) {

    }
}
