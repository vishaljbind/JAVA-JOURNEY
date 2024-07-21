public class LearnAbstract {
   public static void main(String[] args) {
    //Vehicle v1 = new Vehicle();

    Car cr = new Car();
    cr.accelerate();
    cr.brake(4);
    cr.honks();
   } 
}

 abstract class Vehicle {
       abstract void accelerate();
       abstract int  brake(int wheels);

       void honks(){
        System.out.println("Vehicle honks");
       }
}

class Car extends Vehicle {

    
    void accelerate() {
        System.out.println("Car is accelerating");
    }

    
    int  brake(int wheels) {
        System.out.println("Car breaks are pushed");
        return wheels;
    }

    void honks(){
        System.out.println("Vehicle honks");
       }
    
}
