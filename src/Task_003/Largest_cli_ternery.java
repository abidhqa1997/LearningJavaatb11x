package Task_003;

public class Largest_cli_ternery {
    public static void main(String[] args) {
        int v1=Integer.parseInt(args[0]);
        int v2=Integer.parseInt(args[1]);
        int largest=v1>v2?v1:v2;
        System.out.println("largest number is "+largest);
    }
}
