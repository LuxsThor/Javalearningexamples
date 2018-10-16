package Themexamples;

public class tolower {
    public static void main(String[] args) {
        String word = "hello";
        System.out.println(word.toUpperCase() + " " + word);
        char ch = word.charAt(1);
        String ch1 = Character.toString(ch);
        System.out.println(ch + 'A');
        System.out.println(ch1 + 'A');
        System.out.println((char)(66));
        String sub = word.substring(1);
        System.out.println(sub);
    }
}
