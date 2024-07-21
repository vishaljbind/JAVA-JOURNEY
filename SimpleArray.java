public class SimpleArray {
    public static void main(String[] args) {
        int age[]; //declaration
        age = new int[5]; //intializzation

        age[0] = 5;
        age[1] = 10;
        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[4]);
        System.out.println(age.length);

        int marks[] = {89,22,45,67,33};
        System.out.println(marks[3]);

        String names[] = {"anand","prasad","suraj","rohit","virat"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name is : "+names[i]);
        }

        for(String name: names){
            System.out.println("for each : "+name);
        }
    }
}
