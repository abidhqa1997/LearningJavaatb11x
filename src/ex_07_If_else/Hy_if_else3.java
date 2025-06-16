package ex_07_If_else;

import java.util.Scanner;

public class Hy_if_else3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter day");
        String day= sc.next();
        if(day.equals("Monday")||day.equals("Thuesday")||day.equals("Wednesday")||day.equals("Thursday")||day.equals("Friday")){
            System.out.println("OH Its a week day");
        } else if (day.equals("Saturday")||day.equals("Sunday")) {
            System.out.println("Yay Its a weekend");

        }else {

            System.out.println("It is not a day name ");
        }
        sc.close();

    }
}
