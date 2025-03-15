package If_else;

public class largest_of_three_numbers {
    public static void main(String[] args) {
        int p1= 200;
        int p2=300;
        int p3=400;
        if (p1>p3 && p1>p2){
            System.out.println("Laegest number is "+p1);
        }else if(p2>p3 && p2>p1){

            System.out.println("largest number is "+p2);
        }
        else {
            System.out.println("Largest number is "+p3);
        }
        }
    }

