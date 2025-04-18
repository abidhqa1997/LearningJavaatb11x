package ex_08_Switch;

import java.util.Scanner;

public class Switch_02 {
    public static void main(String[] args) {

        Scanner order = new Scanner(System.in);
        System.out.println("Enter Order Price: ");
        int Price= order.nextInt();
        switch (Price){

            case (300):
                System.out.println("Don't order");
                break;
            case (250):
                System.out.println("Try to avoid");
                break;
            case(100):
                System.out.println("GO FOR IT");
                break;
            default:
                System.out.println("Its up to you ");
        }

    }
}
