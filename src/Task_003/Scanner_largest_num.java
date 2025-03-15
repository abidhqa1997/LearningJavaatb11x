package Task_003;

import java.util.Scanner;

public class Scanner_largest_num {
    public static void main(String[] args) {
        Scanner number= new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int F1 = number.nextInt();
        System.out.println("Enter the second value: ");
        int F2 = number.nextInt();
        if (F1>F2){
            System.out.println("F1 is the larget number " +F1);
        }
        else {
            System.out.println("F2 is the largest number "+ F2);
        }
    }
}
