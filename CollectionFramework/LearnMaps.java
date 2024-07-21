package CollectionFramework;

import java.util.*;;

public class LearnMaps {
    public static void main(String[] args) {
        
        Map<String, String> map = new HashMap<>();

        map.put("us", "United States");
        map.put("in", "India");
        map.put("in", "India");
        map.putIfAbsent("in", "india2");
        map.put("en", "England");

        System.out.println(map);

        // map.remove("in");
        // System.out.println(map.containsKey("us"));
        // System.out.println(map.containsValue("England"));

        // System.out.println(map.get("en"));
        // System.out.println(map);
        // System.out.println(map.getOrDefault("pn", "Others"));

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (Map.Entry<String, String> entry: entries) {
            System.out.println(entry.getKey()+" ,"+ entry.getKey());
        }

        Set<String> keys = map.keySet();
        System.out.println(keys);

        ArrayList<String> arrayList = new ArrayList<>(map.keySet());
        System.out.println(arrayList);

        Collection<String> valueSet = map.values();
        System.out.println(valueSet);

        }
}
