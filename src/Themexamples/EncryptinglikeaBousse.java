
// the plan: take in a message and a secret word then encrypt the message with according shifts of the secret word save the encripted and decrepted words in
//seperate files

package Themexamples;
import java.io.*;
import java.util.*;


public class EncryptinglikeaBousse {

    public static String encrypt(String toencrypt, String secretword) {
        // instantiate a new string for the encrpyted message we want to return
        String encryptedmsg = new String("");
        toencrypt = toencrypt.toUpperCase(); //to uppercase to be able to use uniform ASCI codes for shifts
        secretword = secretword.toUpperCase();

        for (int i=0; i < toencrypt.length(); i++){
            int ch = toencrypt.charAt(i) - 'A';
            int shift = secretword.charAt(i % secretword.length()) - 'A';
            char newch = (char)((ch + shift)%26 + 'A');
            encryptedmsg += newch;
        }
        return encryptedmsg;
    }                                                                       // sidenote when to use static? does it make sense to use the method without having an
                                                                            // object of that class instantiated? example a class car might have a public method
                                                                            // convertKMtoMiles
    public static void main(String[] args) throws IOException {
        //read in a message and secret word
        Scanner formessage = new Scanner(System.in);
        System.out.println("give me a message to encrypt");
        String msg = formessage.next();

        Scanner forsecret = new Scanner(System.in);
        System.out.println("give me a secret word");
        String secret = formessage.next();

        // creating a new file
        Scanner file = new Scanner(System.in);
        System.out.println("specify a file name to save your message");
        File unencryptedfile = new File(file.next());
        PrintWriter input = new PrintWriter(unencryptedfile);
        // write message into a file first
        input.println(msg);


        if (!unencryptedfile.exists()){
            System.out.println("inputfile does not exist");
            System.exit(0);
        }

        // open a outputfile
        Scanner encryptedfile = new Scanner(System.in);
        System.out.println("name the encypted file");
        String secretsauce = encryptedfile.next();
        File outputfile = new File(secretsauce);
        PrintWriter output = new PrintWriter(outputfile);

        if (!outputfile.exists()) {
            System.out.println("sorry file does not exist");
            System.exit(0);                                     // When to use System.exit()?
        }

        output.println(encrypt(msg, secret));
        input.close();
        output.close();

    }
}
