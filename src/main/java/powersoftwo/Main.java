package powersoftwo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            int limit = in.nextInt();

            for (int i = 1; i <= limit; i <<= 1)
                System.out.println(i);
        }
    }
}
