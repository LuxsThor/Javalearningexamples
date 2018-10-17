package Themexamples;

public class TestDice {
    public static void main(String[] args) {
        DiceClass d1 = new DiceClass();
        DiceClass d2 = new DiceClass(2);

        System.out.println("number of dice of d1: " + d1.returnDice());
        System.out.println("number of dice of d2: "+ d2.returnDice());

        for (int i = 1; i <= 10; i++){
            System.out.println("roll dice 1 for the " + i + " time:" + d1.rollDice() + " roll dice 2 " + d2.rollDice());
        }

        d1.setDice(5);
        System.out.println("new number of dice in d1 "+ d1.returnDice());

        for (int i = 1; i <= 10; i++){
            System.out.println("roll dice 1 " + d1.rollDice() + " roll dice 2 " + d2.rollDice());
        }
    }
}
