public class CarInheritance extends Vehicle{
    void start(){
        Scooter sc = new Scooter();
        sc.breaking(this);
        super.start();
        System.out.println(this);
        System.out.println(this.model+" Car is starting");
       }

    
    CarInheritance(){
        super(2);
        System.out.println("Car is being created");
       }
       
public static void main(String[] args) {
    
    CarInheritance obj = new CarInheritance();
    //obj.acclerate();
    System.out.println(obj.wheelsCount);
    obj.wheelsCount = 4;
    obj.model = "audi";
    obj.start();
    System.out.println(obj.wheelsCount);
}
   
}

 class  Vehicle {

   final int gears = 4;

    public static void main(String[] args) {
        Vehicle vc = new Vehicle(2);
        vc.acclerate();
        
    }
    int wheelsCount;
    String model;
    void start(){
        System.out.println("vehicle is starting");
    }

    final void acclerate(){
        System.out.println("vehicle is accelarating");
    }

    Vehicle(){
        System.out.println("Creating a vehicle instance");
    }

    Vehicle(int wheelsCount){
        System.out.println("Creating a vehicle with wheels");
    }
        
    }

class Scooter {
void breaking(CarInheritance car){
System.out.println(car.model+"is breaking");
}
}