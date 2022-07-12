package reversing;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            System.out.println(
                    n / 100 + (n % 100) / 10 * 10 + (n % 10) * 100
            );
        }
    }

}
