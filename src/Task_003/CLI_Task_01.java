package Task_003;

import java.util.List;

//public class CLI_Task_01 {
    public class CLI_Task_01 {
        public static void main(String[] args) {
            String name = args[0];
            int age = Integer.parseInt(args[1]);
            long salary = Long.parseLong(args[2]);
            System.out.println("Name of the employee: " + name);
            System.out.println("Age of the employee: " + age);
            System.out.println("Salary of the employee: " + salary);
        }
    }


