public class LearnGenerics {
    public static void main(String[] args) {
        Dog<String> d1 = new Dog<>("anand123");
        Dog<String> d2 = new Dog<>("aee123");

        Dog<Integer> d3 = new Dog<>(12);
        System.out.println(d3.getId());

        Animal<Integer, String> a1 = new Animal<>(32, "Lion");
        System.out.println(a1.getID());
        System.out.println(a1.getName());
    }
}

class Dog<E> {
    //String id;

    E id;
    
    public Dog (E id){
        this.id = id;
    }


    E getId(){
        return this.id;
    }
}

class Animal<E,V>{
    E id;
    V name;

    public Animal(E id, V name){
        this.id = id;
        this.name = name;
    }

    E getID(){
        return id;
    }

    V getName(){
        return name;
    }
}