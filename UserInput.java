
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the firstNumber: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter the secondNumber: ");
        int secondNumber = sc.nextInt();

        double result = firstNumber + secondNumber;
        System.out.println("your Total is "+result);
        sc.close();


    }
}
