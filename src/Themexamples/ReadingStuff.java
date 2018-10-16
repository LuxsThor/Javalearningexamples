package Themexamples;
import java.io.*;
import java.util.*;


public class ReadingStuff {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("./recourses/quotations.txt");
        if(!inputFile.exists()) {
            System.out.println("the file cannot be found");
            System.exit(0);  //what does this 0 do?
        }
        else {
            Scanner input = new Scanner(inputFile);
            String line;

            while(input.hasNext()){   // as long as there is more data
                line = input.nextLine();
                System.out.println(line);
            }
            input.close();
        }

    }
}
