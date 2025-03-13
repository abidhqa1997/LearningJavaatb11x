package Task_003;

public class Task_004 { public static void main(String[] args) {
    int marks=81;
    String grade=(marks<99 && marks>90)?"A":(marks<90 && marks>80)?"B":(marks<80 && marks>69)?"c":(marks<69 && marks>59)?"d":"f";
    System.out.println("The grade is "+grade);
}
}
