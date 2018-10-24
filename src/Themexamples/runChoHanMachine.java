package Themexamples;

public class runChoHanMachine {
    public static void main(String[] args) {
        ChoHanMachine machine = new ChoHanMachine();
        machine.runMachine();
        System.out.println("total number of players who played on this machine: " + ChoHanGameStatic.numPlayers);
        System.out.println("total winnings of the machine is "+ ChoHanGameStatic.totalWinnings);

    }
}
