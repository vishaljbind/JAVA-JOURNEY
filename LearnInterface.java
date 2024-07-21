public class LearnInterface {
    public static void main(String[] args) {
        //Animal an = new Animal();
    Monkey mnk = new Monkey();
    mnk.eats();
    mnk.drinks();
    System.out.println(Animal.legs);
    }
    
}

 interface Animal {
    public static final int legs = 4;
    void eats();
    void drinks();

    default void walk(){
        System.out.println("Animal is walking");
    }
    
}

interface Human {

    void walk();
    void drinks();
}

class Monkey implements Animal , Human{

    @Override
    public void eats() {
        System.out.println("Monkey is eating");
    }

    @Override
    public void walk() {
        System.out.println("Monkey is walking");
    }

    @Override
    public void drinks() {
       System.out.println("drinking");
    }

}
