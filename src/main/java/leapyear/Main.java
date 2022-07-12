package leapyear;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            int year = in.nextInt();

            System.out.println(
                    year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "Leap" : "Regular"
            );
        }
    }
}
