public class FinallyBlockException {
    public static void main(String[] args) {

        //finally block
        int arr[] = new int[5];

        System.out.println("Hello guys");

        try {
            System.out.println(arr[3]);
        } catch (Exception e) {
            System.out.println("Exception handled!");
        } finally {
            System.out.println("I will run always");
        }

        System.out.println("Bye guys");
        

        //throws exception handling
        try {
        
            getNumberFromArray(arr);
            
        } catch (Exception e) {
            System.out.println("catched exception: "+e.getMessage());
        }
        
    }
        // throws exception
    static int getNumberFromArray(int arr[]) throws ArithmeticException{
        return arr[8];
    }
}
