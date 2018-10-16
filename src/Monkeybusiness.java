import java.util.*;

public class Monkeybusiness {
    public static void main(String[] args) {
        int max = 500000;
        String goal = "HERO";
        String trials = "";
        Random num = new Random();
        int count = 0;
        for (int i = 1; i <= goal.length(); i++){
            int number = num.nextInt(26);
            trials += (char)(number + 'A');
            count++;

        }
        System.out.println("first setup is " + trials);

        while (!(trials.equals(goal)) && count <= max){
            trials = trials.substring(1); //delete first character
            int newletter = num.nextInt(26);
            trials += (char)(newletter + 'A');
            count++;
        }

        if (count <= max){
            System.out.println("It took " + count + " attempts to randomly generate the work HERO");
        }
        else {
            System.out.println("I gave up trying to randomly generate the Word HERO... THe last try gave me " + trials);
        }

    }
}
