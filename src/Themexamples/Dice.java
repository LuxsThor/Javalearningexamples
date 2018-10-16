package Themexamples;

import java.util.* ;


public class Dice {

    public static void main(String[] args) {
        Random würfel = new Random();
        int dice = ((würfel.nextInt(6) + 1) + würfel.nextInt(6) + 1);
        System.out.println(dice);

        String hello = "Hello";
        System.out.println(hello.charAt(1));
    }
}

