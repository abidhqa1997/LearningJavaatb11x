package ex_10_While_Loop;

public class Hyr_while5 {
    public static void main(String[] args) {
        int i=40;
        int sum=0;

        while (i<=80){
            if (i%2==0){
                sum+=i;
            }
            i++;
        }
        System.out.println("Sum of Even Number"+sum);
    }
}
