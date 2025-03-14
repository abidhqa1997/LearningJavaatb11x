package Task_003;

public class CLI_Task_02 {
    public static void main(String[] args) {
        int Alfa= Integer.parseInt(args[0]);
        int Beta= Integer.parseInt(args[1]);
        int result=Alfa>Beta?Alfa:Beta;
        System.out.println(result);
    }
}
