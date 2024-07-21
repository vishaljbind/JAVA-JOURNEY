import java.util.Scanner;

public class StringMethods{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first Name : ");
        String firstName = sc.nextLine();
        System.out.println("Enter your last Name");
        String lastName = sc.nextLine();

        System.out.println("Your full name is "+firstName+" "+lastName+"");
        System.out.println(firstName+lastName);

        sc.close();

        /// String Methods
        String name = "  aNaNd23  ";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        System.out.println("carpet".startsWith("car"));
        System.out.println("carpet".endsWith("pet"));
        System.out.println("carpet".charAt(3));
        char temp = "carpet".charAt(3);
        System.out.println(temp);

        //conversion
        int age = 23;
        String stringAge = String.valueOf(age);
        System.out.println(stringAge);
        System.out.println(age);

        //replace
        String sentence = "I love java, java is good language";
        String newSentence = sentence.replace("java", "Kotlin");
        System.out.println(sentence);
        System.out.println(newSentence);

        System.out.println(sentence.contains("java"));

        String subString = sentence.substring(2, 5);
        System.out.println(subString);

       String words[] = sentence.split(" ");
       for (String word : words) {
            System.out.println(word);
       }

       //
       String color = "Blue";
       char letters[] = color.toCharArray();
       System.out.println(letters);
       for (char letter : letters) {
        System.out.println(letter);
       }

       //
       String movie = "";
       if (movie.isEmpty()) {
        System.out.println("empty");
       }

    }
}
