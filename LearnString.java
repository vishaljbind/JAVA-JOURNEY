public class LearnString {
    public static void main(String[] args) {
        String name = "Anand";
        String sameString  = "Anand";
        String newName = new String("Anand");

        System.out.println(name);
        System.out.println(sameString);
        System.out.println(newName);
        System.out.println("Anand");

        if (name == sameString) {
            System.out.println("both are same");
        }

        if (name == newName) {
            System.out.println("both are same");
        } else {
            System.out.println("both are not same!");
        }


        if (name.equals(newName)) {
            System.out.println("both name and newName are same");
        } else {
            System.out.println("not same");
        }

        if (name.equalsIgnoreCase(newName)) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }
    }
}
