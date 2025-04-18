package ex_10_While_Loop;

import java.util.Scanner;

public class While_loop03 {
    public static void main(String[] args) {
        Scanner digit =new Scanner(System.in);
        System.out.println("Enter the digit:  ");
        int number=digit.nextInt();
        int factorial=1;

        if (number<=0){

            System.out.println(factorial);
        }else{

            for (int i=0;i<=number;i++){
                factorial=factorial*i;
            }
        }

        System.out.println("Factorial  " +factorial);


    }
}
