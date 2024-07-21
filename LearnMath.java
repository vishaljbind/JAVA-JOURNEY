public class LearnMath {
    public static void main(String[] args) {
        
        int a = 5;
        int b = 7;

        System.out.println(Math.min(a, b));
        System.out.println(Math.sqrt(a));
        System.out.println(Math.pow(a, b));
        System.out.println(Math.abs(a));
        System.out.println(Math.random());
         int number = getRandom(10, 20);
         System.out.println(number);
         System.out.println(Math.floor(7.8));
         System.out.println(Math.ceil(5.6));
         System.out.println(Math.round(5.3));
    }

    public static int getRandom(int a, int b){
        // return (int) Math.random()*6 + 1;
        return (int) (Math.random()*(b-a+1) + a);
    }
}
