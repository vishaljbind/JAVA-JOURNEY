package CollectionFramework;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSets {

    enum Color {
        RED, YELLOW, GREEN
    }
    public static void main(String[] args) {

        System.out.println(Color.GREEN);

        EnumSet<Color> enumSet =  EnumSet.allOf(Color.class);
        enumSet.add(Color.GREEN);
        
        // Set<Integer> set = new HashSet<>();  //o(1)
        // Set<Integer> set = new LinkedHashSet<>();  //O(n)
        Set<Integer> set = new TreeSet<>();  // O(log n)

        set.add(10);
        set.add(10);
        set.add(20);
        set.add(23);
        set.add(78);
        set.add(45);
        
        System.out.println(set);

        System.out.println(set.contains(23));

        set.remove(10);

        System.out.println(set);

        // Custom class hashset
        Set<Student> set2 = new HashSet<>();
        set2.add(new Student(1, "anand"));
        set2.add(new Student(1, "anand"));
        set2.add(new Student(1, "anand"));

        System.out.println(set2);
    }
}

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (id != other.id)
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

    

    
}
