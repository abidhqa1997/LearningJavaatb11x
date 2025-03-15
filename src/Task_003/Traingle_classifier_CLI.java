package Task_003;

public class Traingle_classifier_CLI {
    public static void main(String[] args) {
        int L1= Integer.parseInt(args[0]);
        int L2= Integer.parseInt(args[1]);
        int L3= Integer.parseInt(args[2]);

        if(L1==L2&&L1==L3){

            System.out.println("Equilateral Traingle or Accute Triangle");

        }
        else if (L1==L2||L2==L3||L3==L1){

            System.out.println("Isoceles Triangle ");
        }
        else {
            System.out.println("scalene Triangle ");
        }

    }
}
