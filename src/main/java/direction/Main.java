package direction;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            switch (in.nextInt()) {
                case 1 -> System.out.println("move up");
                case 2 -> System.out.println("move down");
                case 3 -> System.out.println("move left");
                case 4 -> System.out.println("move right");
                case 0 -> System.out.println("do not move");
                default -> System.out.println("error!");
            }
        }
    }
}
