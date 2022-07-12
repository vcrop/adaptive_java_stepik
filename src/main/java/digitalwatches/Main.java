package digitalwatches;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            int n = in.nextInt() % 86400;
            System.out.println(
                    LocalTime.ofSecondOfDay(n).format(DateTimeFormatter.ofPattern("H:mm:ss"))
            );
        }
    }
}
