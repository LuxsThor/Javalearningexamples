package Themexamples;
import java.io.*;
import java.util.*;
import java.text.*;

//Problem definition:
//        input : file with movie title and rating delineated by a # title # 3 5 1 4
//        output : title -- average rating (1 decimal)

//the plan
//1. ask for a file and create new output file
//2. Scan the file
//3. Scan to #
//4. Compute ratings after #
//5. Print to newfile line by line



public class fixMovieRating {
    public static void main(String[] args) throws IOException {
        // following a scanner to Ask the user for a file to fix
        Scanner inputkeyboard = new Scanner(System.in);
        System.out.println("which movie file would you like to fix?");
        File tofix = new File(inputkeyboard.next());
        //following a scanner to scan the acutal file
        Scanner inputfile = new Scanner(tofix);


        if(!tofix.exists()){
            System.out.println("this file does not exist! terminating now");
            System.exit(0);
        }

        File fixed = new File("averageMovieRatings.txt");
        PrintWriter output = new PrintWriter(fixed);

        if(!fixed.exists()){
            System.out.println("whoopsi the output file does not exist! terminating now!");
            System.exit(0);
        }

        DecimalFormat formatter = new DecimalFormat("#.0");
        final String SEPARATOR  = "#"; // # symbol separates title from ratings

        while (inputfile.hasNext()){
            String title = inputfile.next(); // read and print first word of the title
            while (!title.equals(SEPARATOR)) {// read and print the remainder of the title
                output.print(title + " ");
                title = inputfile.next(); // skipping to next part of the title if there is
            }
            // at this point the title is scanned and printed to a new file now its time to calculate the rating
            //first we initialise variables
            int sum = 0;
            int numberofratings = 0;


            while(inputfile.hasNextInt()){
                sum += 1;
                numberofratings++;
            }
            //calculate the average rating with the formatter
            output.println("--" + formatter.format (((double)sum)/ numberofratings));


        }
        inputfile.close();
        output.close();
    }
}
