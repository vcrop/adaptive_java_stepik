package grades;

import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            Map<Integer,Integer> map = IntStream.range(0, n)
                    .mapToObj(in::nextInt)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(i -> 1)));
            System.out.println(
                    IntStream.range(2, 6)
                            .map(map::get)
                            .mapToObj(Integer::toString)
                            .collect(Collectors.joining(" "))
            );
        }
    }
}
