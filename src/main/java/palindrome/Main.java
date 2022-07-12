package palindrome;

import java.util.Scanner;

public class Main {

    public static boolean palindrome(String word) {
        for (int i = 0; i < word.length() / 2; i++)
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) return false;
        return true;
    }

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            String word = in.nextLine();

            System.out.println(palindrome(word) ? "yes" : "no");
        }
    }
}
