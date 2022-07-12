package floorspaceoftheroom;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            double area = 0;
            switch (in.nextLine()) {
                case "triangle": {
                    double a = in.nextDouble();
                    double b = in.nextDouble();
                    double c = in.nextDouble();
                    double p = (a + b + c) / 2;
                    area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                }
                ;
                break;
                case "rectangle":
                    area = in.nextDouble() * in.nextDouble();
                    break;
                case "circle":
                    area = Math.pow(in.nextDouble(), 2) * 3.14;
                    break;
            }
            System.out.println(area);
        }
    }
}
