package Program;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle width and height:");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", rectangle.Area());
        System.out.printf("PERIMETER = %.2f%n", rectangle.Perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rectangle.Diagonal());

    }
}