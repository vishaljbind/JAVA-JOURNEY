package CollectionFramework;

import java.util.*;;

public class ListsOperation {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        //List<String> fruits = new LinkedList<>();
        //List<String> fruits = new Vector<>();

        fruits.add("Mango");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("grapes");
        fruits.add("watermelon");

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("fruits is: "+fruits.get(i));
        }

        for (String fruit : fruits) {
            System.out.println("for each fruit"+fruit);
        }

        Iterator<String> fe = fruits.listIterator();
        while (fe.hasNext()) {
            System.out.println(fe.next());
        }

        List<String> smallList = fruits.subList(1, 4);
        System.out.println(smallList);
    }
}
