package ex_06_ternary_operator;

public class Nested_ternary {
    public static void main(String[] args) {
        int n1 =40;
        int n2=50;
        int n3=60;
        int min= (n1<n3)?(n2<n3)?n3:n1:((n1<n2)?n2:n1);
        System.out.println(min);
        int n11 = 2;
        int n22 = 9;
        int n33 = -11;
        int max1 = (n11 > n22) ? (n11 > n33) ? n11 : n33 : ((n22 > n33) ? n22 : n33);
        System.out.println("Max ix " + max1);
    }
}
