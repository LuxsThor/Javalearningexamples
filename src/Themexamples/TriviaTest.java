package Themexamples;

import java.io.IOException;

public class TriviaTest {
    public static void main(String[] args) throws IOException {
        TriviaClass Liontrivia = new TriviaClass("./recourses/testtrivia.txt");
        Liontrivia.giveTest();
    }
}
