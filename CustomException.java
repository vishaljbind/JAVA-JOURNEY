import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) throws MyException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Age: ");
        int age = sc.nextInt();
        if (age > 100) {
           throw new MyException("My error is this");
           //throw new ArithmeticException("Arithmatic error is this");
        }
    }
}

class MyException extends Exception{
      public MyException(String message){
        super(message);
      }
}