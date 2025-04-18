package ex_08_Switch;

import java.util.Scanner;

public class Switch_01 {
    public static void main(String[] args) {
        Scanner En_browser=new Scanner(System.in);
        System.out.println("Enter the browser name: ");
        String browser=En_browser.next();

        switch (browser){
            case "chrome":
                System.out.println("Browsing in Chrome ");
                break;
            case "firefox" :
                System.out.println("Browsing in firefox");
                break;
            default:
                System.out.println("Unknown");

        }

           // case



    }
}
