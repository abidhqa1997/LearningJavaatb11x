package ex_07_If_else;

import java.util.Scanner;

public class Hy_if_else2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you're Marks");
            int Marks= sc.nextInt();
            if (Marks>0 && Marks<100)
            { if (Marks==35){
                System.out.println("You are Pass");
            }if(Marks>35 && Marks<=70){
                System.out.println("You are Third Class");
            }if (Marks>70 && Marks<=80){
                System.out.println("You are Second Class");
            }if (Marks>80){
                System.out.println("You are First Class");
            }if (Marks<35){
                System.out.println("Yor are Failed");
            }
        }else {
            System.out.println("Give Marks above 0 and below 100");

        }
            sc.close();


    }
}
