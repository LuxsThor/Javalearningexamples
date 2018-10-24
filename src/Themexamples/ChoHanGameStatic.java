package Themexamples;

import java.util.*;

public class ChoHanGameStatic {
    private DiceClass dice;
    public static int numPlayers;
    public int winnings = 0;
    public static int totalWinnings = 0;

    public ChoHanGameStatic() {
        this.dice = new DiceClass(2);

        numPlayers++;
    }

    public void playGame(int bet, String guess) {
        int roll = this.dice.rollDice();
        System.out.println("the dice show " + roll);
        boolean check = roll % 2 == 0;
        System.out.println("even uneven evaluated to " + check);
        if (!guess.equals("Han") && !guess.equals("Cho")) {
            System.out.println("invalid input Cho or Han are the options. try again!");
            System.exit(0);

        }
        if ((roll % 2 == 0 && guess.equals("Han")) || (!(roll % 2 == 0) && guess.equals("Cho"))) {
            winnings += bet;
            totalWinnings += bet;
            System.out.println("yay you won! your current winnings are: "  + winnings);

        }

        else {
            winnings -= bet;
            totalWinnings -= bet;
            System.out.println("whoopsi you lost. your current winnings are: " + winnings);
        }

    }


    public static void main(String[] args) {
        String answer = "Yes";
        int winnings = 0;
        int numberoggamesplayed = 0;
        while (answer.equals("Yes")) {
            ChoHanGame newgame = new ChoHanGame();
            Scanner askplayer = new Scanner(System.in);
            System.out.println("How much do you want to bet?");
            int bet = askplayer.nextInt();
            System.out.println("what do you bet on? Cho or Han?");
            String playerguess = askplayer.next();
            winnings += newgame.playGame(bet, playerguess);
            System.out.println("Your current winnings: " + winnings);
            System.out.println("would you like to continue? Yes or No?");
            answer = askplayer.next();
            numberoggamesplayed++;
        }
        System.out.println("your total result while playing " + numberoggamesplayed + " games is " + winnings);
    }
}

