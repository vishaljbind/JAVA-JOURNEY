package Packages.LearnPackages;

public class Teacher {
    public int teachClass;

    private int id;
    protected int studentCount;
    
    String degree; // default or package-private
    public static void main(String[] args) {
        Teacher tch = new Teacher();
        tch.teachClass = 12;
        tch.id = 123;
    }
}


