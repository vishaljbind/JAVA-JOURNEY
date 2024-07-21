package Packages.LearnPackages;

public class Person {
    private int age;
    private String name;
    public static int count = 12;
    public static final String scientificName = "Homo Sapiens";


    boolean canBeChanged = true;

    public void setAge(int age){
        if (canBeChanged) {
            if (age > 0 ) {
                this.age = age; 
            }
             
        }
       
    }

    boolean canBeAccess = false;

    public int getAge(){
        if (canBeAccess) {
            return age;
        }
        return -1;
    }
}
