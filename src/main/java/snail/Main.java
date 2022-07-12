package snail;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int H = in.nextInt();
            int A = in.nextInt();
            int B = in.nextInt();

            System.out.println(
                    H < A ? 1 : (H - A) / (A - B) + ((H - A) % (A - B) == 0 ? 1 : 2)
            );
        }
    }
}
