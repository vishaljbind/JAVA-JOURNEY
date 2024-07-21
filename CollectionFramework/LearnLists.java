package CollectionFramework;

import java.util.*;

public class LearnLists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(12);
        list.add(12);

        list2.add(34);
        list2.add(67);
        list2.add(12);
        list2.add(30);

        System.out.println(list);
        // System.out.println(list.size());
        // System.out.println(list.contains(30));
        // System.out.println(list.remove(1));
        // System.out.println(list.remove(Integer.valueOf(30)));

        // list.addAll(list2);
        //list.removeAll(list2);
        // list.retainAll(list2);
        //list.clear();

        //converting list to array
        // Object arr[] = list.toArray();
        // for (Object e: arr){
        //     Integer temp = (Integer) e;
        //     System.out.println(e);
        // }

        //List methods from List Interface

        System.out.println(list.get(1));
        System.out.println(list.set(1, 200));
        list.add(2, 300);
        list.remove(2);
        list.indexOf(12);

        
        System.out.println(list);
    }
}
