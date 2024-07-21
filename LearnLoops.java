import java.util.Scanner;

public class LearnLoops {
    public static void main(String[] args) {
        //  for loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for Table: ");
        int num = sc.nextInt();
        System.out.println(""+num+" Table is : ");
        for(int i = 1; i <= 10; i++ ){
            System.out.println(num+" * "+i+" = "+i*num);
        }
        

        // while loop
        boolean hasLearnt = false;
        while (!hasLearnt) {
            System.out.println("went to school, tried to learn");
            System.out.println("Have you understand ? ");
            hasLearnt = sc.nextBoolean();
        } 
        sc.close();
        
        // do while loop
        int i = 10;
        do {
            System.out.println(i);
            i++;
        } while(i <= 5);
                System.out.println("out of loop");
        
}
}