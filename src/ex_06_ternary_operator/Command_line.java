package ex_06_ternary_operator;

public class Command_line {
    public static void main(String[] args) {
        String age= args[0];
        //System.out.println(age);
        int age_integer=Integer.parseInt(age);
        if (age_integer>18) {
            System.out.println("Major");
        } else {
            System.out.println("Minor age " +age_integer);
        }

    }
}
