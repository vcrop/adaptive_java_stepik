package chessboard;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            int h1 = in.nextInt();
            int v1 = in.nextInt();
            int h2 = in.nextInt();
            int v2 = in.nextInt();

            System.out.println(
                    h1 == h2 || v1 == v2 || Math.abs(h1 - h2) == Math.abs(v1 - v2) ? "YES" : "NO"
            );
        }
    }
}
