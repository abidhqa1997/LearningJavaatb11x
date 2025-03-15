package Task_003;

import java.util.Scanner;

public class Scanner_Task_01 {
    public static void main(String[] args) {
        Scanner Details= new Scanner(System.in);
        System.out.println("Enter the name of the employee: ");
        String Name=Details.next();
        System.out.println("Enter the age of the Employye: ");
        int age=Details.nextInt();
        System.out.println("Enter the salary of the employee: ");
        long salary=Details.nextLong();

        System.out.println("Name of  the employee "+Name);
        System.out.println("Age of the employee "+age);
        System.out.println("Salary of the employee "+salary);
    }
}
