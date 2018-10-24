package Themexamples;
import java.applet.*;
import java.*;
import java.io.*;
import java.util.Scanner;


public class UIClass {

    private MyPod mypod;


    public UIClass() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("give me the audiofile list to load:");
        String filename = input.next();
        mypod = new MyPod(filename);
    }

    public void displayMenu() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println();
        String choice = " ";
        while (!choice.equals("e")) {
            System.out.println();
            System.out.println(" Menu:\n ");
            System.out.println(" d. Scroll Down ");
            System.out.println(" u. Scroll Up ");
            ;
            System.out.println(" p. play ");
            System.out.println(" s. stop ");
            System.out.println(" l. loop ");
            System.out.println(" e. end\n ");
            System.out.print(" Choice: ");
            choice = input.next();

            if (choice.equals("d "))
                mypod.down();
            else if (choice.equals("u "))
                mypod.up();
            else if (choice.equals("p "))
                mypod.play();
            else if (choice.equals("s "))
                mypod.stop();
            else if (choice.equals("l "))
                mypod.loop();
            else if (choice.equals("e "))
                mypod.turnoff();
            else
                System.out.println("Illegal choice: " + choice);

        }
    }

    public static void main(String[] args) throws IOException {
        UIClass ui = new UIClass();
        ui.displayMenu();
        }
}