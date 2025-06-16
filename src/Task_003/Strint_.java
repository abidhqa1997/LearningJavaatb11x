package Task_003;

public class Strint_ {
    public static void main(String[] args) {
        String strValue="Abidh is learning java";
        String strArray[]=strValue.split(" ");
        //{}
        //System.out.println(strArray[1]);

        //for (String result:strArray)
        {
         //   System.out.println(result);
        }
        for (int i=0;i< strArray.length;i++){
            if (i%2==0)
                System.out.println("even index" +strArray[i]);
        }
        for (int i=0;i<strArray.length;i++){
            if (strArray[i].length()%2==0) {
                System.out.println(strArray[i]);
            }
        }




    }
}
