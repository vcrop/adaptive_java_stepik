package mkad;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            int V = in.nextInt();
            int T = in.nextInt();

            int kilometer = V * T % 109;

            System.out.println(
                kilometer < 0 ? kilometer + 109 : kilometer
            );
        }
    }
}
