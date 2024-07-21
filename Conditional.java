import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible for Vote!");
        } else {
            System.out.println("You are not eligible to vote!");
        }
       
        int day = sc.nextInt();
        
        System.out.println("Enter the day");
        if (day == 1) {
            System.out.println("go to college");
        }
        else if (day == 5){
            System.out.println("go to movie cinema");
        } else {
            System.out.println("holiday");
        }

        sc.close();
    }
}
