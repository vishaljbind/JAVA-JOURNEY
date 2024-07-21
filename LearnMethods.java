public class LearnMethods {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        greet();
        average(12,23);
        int avgFromFunc = average(10, 20);
        System.out.println(avgFromFunc);
    }

    static void greet(){
        System.out.println("hello world");
    }

    public static int average(int a, int b){
        int avg = (a+b)/2;
        //System.out.println("Average is : "+avg);
        return avg;
    }
}
