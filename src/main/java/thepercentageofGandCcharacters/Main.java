package thepercentageofGandCcharacters;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            String seq = in.nextLine().toLowerCase();

            int count = 0;

            for (char ch: seq.toCharArray())
                if (ch == 'c' || ch == 'g') count++;

            System.out.println(
                    (double) count / seq.length() * 100
            );
        }
    }
}
