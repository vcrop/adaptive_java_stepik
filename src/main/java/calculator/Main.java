package calculator;

import java.util.Scanner;

public class Main {

    public static int[] get(int number) {
        int[] array = new int[number + 1];
        for (int i = 1; i <= number; i++) {
            array[i] = array[i - 1] + 1;
            if (i % 3 == 0) array[i] = Math.min(array[i / 3] + 1, array[i]);
            if (i % 2 == 0) array[i] = Math.min(array[i / 2] + 1, array[i]);
        }
        return array;
    }

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            int number = in.nextInt();

            int[] array = get(number);
            int value = array[number];

            StringBuilder result = new StringBuilder(number + "");

            while (value-- != 1) {
                if (number % 3 == 0 && array[number / 3] == value) {
                    result.insert(0, (number /= 3) + " ");
                } else if (number % 2 == 0 && array[number / 2] == value) {
                    result.insert(0, (number /= 2) + " ");
                } else result.insert(0, (number -= 1) + " ");
            }

            System.out.println(result.toString().split(" ").length - 1);
            System.out.println(result);

        }
    }
}
