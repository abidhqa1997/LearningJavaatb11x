package ex_07_If_else;

import java.util.Scanner;

public class Hy_if_else1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter yor number ");
        int num= sc.nextInt();
        if (num%2==0){
            System.out.println(" Given number is Even number ");

        }else {

            System.out.println("Given number is odd number");
        }
        sc.close();
    }
}
