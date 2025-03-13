package ex_06_ternary_operator;

public class Age_ternary {
    public static void main(String[] args) {
        int age=20;

        String Legal=age>18?"Legal Age":"Not legal";
        System.out.println(Legal);
        String Pension=age<65?"Not eligible for pension scheme":"Eligible for pension";
        System.out.println(Pension);

    }
}
