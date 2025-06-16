package ex_10_While_Loop;

public class Hyr_while4 {
    public static void main(String[] args) {
        int i=50;

        while(i<=150){
            if (i%i==0 || i%1==0){

                System.out.println("it is a prime number"+i);
            }
            i++;
        }
    }
}
