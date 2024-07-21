public class MethodOverLoading {
    public static void main(String[] args) {
        Greet gt = new Greet();
        gt.greeting();
        gt.greeting("Anand");
        gt.greeting("John", 5);
    }
}

/**
 * InnerMethodOverLoading
 */ class Greet {
    void greeting(){
        System.out.println("Good morning");
    }
    
    void greeting(String name){
        System.out.println("Good Morning, "+name);
    }

    void greeting(String name, int count){
         for (int i = 0; i < count; i++) {
            System.out.println("Good Morning, "+name);
         }
    }
}
