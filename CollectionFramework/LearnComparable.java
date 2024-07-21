package CollectionFramework;

import java.util.*;;

public class LearnComparable {
    public static void main(String[] args) {
        Animal a1 = new Animal(24, "Leo", 140);
        Animal a2 = new Animal(24, "Tiger", 150);
        Animal a3 = new Animal(34, "Bruno", 40);
        Animal a4 = new Animal(10, "Maxo", 15);
        Animal a5 = new Animal(23, "Don", 90);

        List<Animal> dogs = new ArrayList<>();
        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);
        dogs.add(a5);

        System.out.println(dogs);

        Collections.sort(dogs);
        System.out.println(dogs);

        // Collections.sort(dogs, new Comparator<Animal>() {

        //     @Override
        //     public int compare(Animal o1, Animal o2) {
        //         return o1.weight - o2.weight;
        //     }
            
        // });

        Collections.sort(dogs, new MyCustomComparater());
        System.out.println(dogs);

        Collections.sort(dogs, new Comparator<Animal>() {

            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.name.compareTo(o2.name);
            }
            
        });

        System.out.println(dogs);

        // Lamda expression best comparing methods for soritng
        Collections.sort(dogs, (o1, o2) -> o1.name.compareTo(o2.name) );
        System.out.println(dogs);

        // comparing methods

        Collections.sort(dogs, Comparator.comparing(Animal::getAge).thenComparing(Animal::getName));
        System.out.println(dogs);

        int arr[][] = {
            {4,5,1},
            {5,2,4},
            {6,9,0},
            {1,3,5}
        };

        Arrays.sort(arr, (arr1, arr2) -> {
            return arr1[0] - arr2[0];
        });

        for (int e[]  : arr) {
            for (int element : e) {
                System.out.print(element+" ");
            }
            System.out.println();
        }

    }
}

class Animal implements Comparable<Animal>{
    int age;
    String name;
    int weight;

    public Animal(int age, String name, int weight){
          this.age = age;
          this.name = name;
          this.weight = weight;

        
    }

    @Override
        public String toString() {
            return "Animal{"+
                "age= " + age +
                ", name= '" + name + '\'' +
                ", weight= " + weight +
            '}' + "\n";
        }

    @Override
    public int compareTo(Animal that) {
        if (this.age == that.age) {
            return this.name.compareTo(that.name);
        }
        return this.age - that.age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
}

class MyCustomComparater implements Comparator<Animal>{

    @Override
    public int compare(Animal o1, Animal o2) {
        return Integer.compare(o1.weight, o2.weight);
    }

}
