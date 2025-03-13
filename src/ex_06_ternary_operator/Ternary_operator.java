package ex_06_ternary_operator;

public class Ternary_operator {
    public static void main(String[] args) {
        int a=100;
        int b=200;
        //find the maximum of two numbers
        int max=a>b?a:b;
        System.out.println(max);
        int min=a<b?a:b;
        System.out.println(min);
    }
}
