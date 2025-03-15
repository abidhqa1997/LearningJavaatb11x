package Task_003;

public class Even_or_odd_CLI {
    public static void main(String[] args) {
        int a1=Integer.parseInt(args[0]);
        if (a1%2==0){
            System.out.println("It is even number");
        }
        else {

            System.out.println("It is odd number ");
        }
    }
}
