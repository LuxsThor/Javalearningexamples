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
}

