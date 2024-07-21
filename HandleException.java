
public class HandleException {
    public static void main(String[] args) {
        int arr[] = new int[5];

        System.out.println("Hello guys");

        try {
            int result = 5/0;
            System.out.println(arr[8]);
        } 
        // catch (ArrayIndexOutOfBoundsException e) {
        //     System.out.println("Try to access the out of bound exception!");
        // } catch (ArithmeticException e){
        //         System.out.println(e.getMessage());
        //         System.out.println(e.getStackTrace());
        //         System.out.println(e);
        // }

        catch (Exception e){

        }

        System.out.println("Bye guys");
    }
    
}