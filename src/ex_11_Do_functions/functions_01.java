package ex_11_Do_functions;

public class functions_01 {
    public static void main(String[] args) {
 int result=r1();
 String att=name();
 boolean b2=b1();
 float flt=f1();
        System.out.println(result);
        System.out.println(att);
        System.out.println(b2);
        System.out.println(flt);
    }
    static  int r1(){
        return 100;
    }
    static boolean b1(){
        return false;
    }
    static String name(){
        return "Abidh";
    }
    static float f1(){
        return 0.5f;
    }
}
