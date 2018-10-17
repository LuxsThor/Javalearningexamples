package Themexamples;
import java.util.* ;

public class DiceClass {
    //instance variables of a dice object
    // private variables are only accessible to methods inside the class
    private int numDice;
    private Random random;
    // constructor for no parameters. The name is always the same as the classname
    public DiceClass(){
        this.numDice = 1;
        this.random = new Random();
    }
    // constructor for some parameters
    public DiceClass(int numberofdice){
        this.numDice = numberofdice;
        this.random = new Random();
    }

    public int rollDice(){
        int sum = 0;
        for (int i = 0; i < numDice; i++){
            sum += random.nextInt(6) + 1;
        }
        return sum;
    }
    //getters and setter for the private variables
    public void setDice(int setnumberofdice){
        this.numDice = setnumberofdice;
    }

    public int returnDice(){
        return this.numDice;
    }

}
