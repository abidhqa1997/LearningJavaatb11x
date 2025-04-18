package ex_08_Switch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner day = new Scanner(System.in);
        System.out.println("Enter the time : ");
        int  time=day.nextInt();
        switch (time){

            case (12) :
                System.out.println("don't go for lunch");
                break;
            case 1:
                System.out.println("go for lunch");
            default:

                System.out.println("Time out dont go fo lunch " );
        }

        }
    }

