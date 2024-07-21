
public class LearnObject {
    public static void main(String[] args) {
        Car obj = new Car("Honda", 2024);
        Car obj1 = new Car("Honda", 2022);

        System.out.println(obj.equals(obj1));
        System.out.println(obj.toString());
        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());
    }
    
}

class Car {
    String model;
    int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    

    public boolean equals(Object obj){
        Car that = (Car)obj;
       if (this.model.equals(that.model) && this.year == that.year) {
        return true;
       }
       return false;
    }
    
    @Override
    public int hashCode(){
        int intialNumber = 31;
        intialNumber += year;
        intialNumber += model.hashCode();
        return intialNumber;


    }
    
    @Override
    public String toString(){
        return " Car ka model"+model+"and year is"+year;
    }
}
