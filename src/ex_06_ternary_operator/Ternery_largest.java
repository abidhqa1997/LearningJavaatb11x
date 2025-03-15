package ex_06_ternary_operator;

public class Ternery_largest {
    public static void main(String[] args) {
        int b1=400;
        int b2=500;
        int b3=600;
        int b4=700;
        int largest=(b1>b2&&b1>b3&&b1>b4)?b1:(b2>b3&&b2>b1&&b2>b4)?b2:(b3>b2&&b3>b1&&b3>b4)?b3:b4;
        System.out.println("Largest number is "+largest);
    }
}
