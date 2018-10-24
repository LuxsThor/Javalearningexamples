package Themexamples;

import java.util.Scanner;

public class ChoHanMachine {

    private ChoHanGameStatic game;

    public void runMachine(){

        Scanner input = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = input.next();
        while(!name.equals("DONE")){
            game = new ChoHanGameStatic();
            String wantmore = "yes";
            while (!wantmore.equals("no")) {
                System.out.println("how much do you want to bet?");
                int bet = input.nextInt();
                System.out.println("what is your guess? Cho or Han?");
                String guess = input.next();
                game.playGame(bet, guess);
                System.out.println("do you want to continue playing? yes or no");
                wantmore = input.next();
            }
            System.out.println("What is your name? if you want to stop playing enter DONE");
            name = input.next();
        }

    }
}
