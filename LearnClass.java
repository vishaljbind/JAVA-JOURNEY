public class LearnClass {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "Tommy";
        d1.bark();

        Dog d2 = new Dog();
        d2.name = "Leo";
        d2.walk();

    }

    
}

  
    class Dog {
        String name;
        int age;
        String color;
 
        void walk(){
         System.out.println(name+" Dog is walking");
        }
 
        void bark(){
         System.out.println(name+" Dog is barking");
        }
         
     }