
public class FindLargestNumber {
    public static void main(String[] args) {
        int a = 4;
        int b = 8;
        int c = 11;
        int max = 0;

        if (a > b) {
            System.out.println(" a is bigger than b");
            if(a > c){
System.out.println(" a is bigger than c");
System.out.println(" a is largest : "+a);
            } else {
                System.out.println("c is greates than a");
                System.out.println("c is largest number"+c);
            }
        }else {
System.out.println("b is bigger than a");
if (b > c) {
    System.out.println("b is greates than c");
                System.out.println("b is largest number"+b);
}
else {
    System.out.println("c is greates than b");
                System.out.println("c is largest number"+c);
}
        }


        //ternary operator

        max = a>b ? a > c ? a : c : b > c ? b : c;
        System.out.println("Largest number is: "+max);
    }
}
