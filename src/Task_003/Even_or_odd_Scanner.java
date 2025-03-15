package Task_003;

import java.util.Scanner;

public class Even_or_odd_Scanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the input: ");
        int P1=input.nextInt();
        if(P1%2==0){
            System.out.println("It is an even Number ");
        }
        else {

            System.out.println("It is an odd number");
        }
    }
}
