package Task_003;

import java.util.Scanner;

public class Triangle_classifier_Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side 1 value: ");
        double s1 = input.nextDouble();

        System.out.print("Enter the side 2 value: ");
        double s2 = input.nextDouble();

        System.out.print("Enter the side 3 value: ");
        double s3 = input.nextDouble();

        // Classifying the triangle based on side lengths
        if (s1 == s2 && s1 == s3) {
            System.out.println("Equilateral Triangle");
        } else if (s1 == s2 || s2 == s3 || s1 == s3) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }

        input.close();
    }
}

