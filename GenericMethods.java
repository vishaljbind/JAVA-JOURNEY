public class GenericMethods {
    public static void main(String[] args) {
        printData("anand");
        printData(123);

        GenericMethods obj = new GenericMethods();
        obj.doubleData("anand");
        obj.doubleData(123);
    }

    static <E> void printData(E data){
        System.out.println(data);
    }

    <E> void doubleData(E data){
        System.out.println(data);
    }
}
