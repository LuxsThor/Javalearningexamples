package Themexamples;
import java.util.*;

public class StaticDice {
    private int numDice;
    private Random random;
    static private int totalDice = 0;

    public StaticDice(){
        numDice = 1;
        random = new Random();
        totalDice++;
    }

    public StaticDice(int n){
        numDice = n;
        random = new Random();
        totalDice++;
    }

    public int getTotalDice(){
        return totalDice;
    }

    public static void main(String[] args) {
        StaticDice dice1 = new StaticDice();
        StaticDice dice2 = new StaticDice(5);
        StaticDice dice3 = new StaticDice(3);
        System.out.println(dice1.getTotalDice() +" "+ dice2.getTotalDice()+ " "+ dice3.getTotalDice());
    }
}
