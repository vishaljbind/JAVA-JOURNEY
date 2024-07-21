package Packages.Package2;

import Packages.LearnPackages.Teacher;

public class MainPackage2 extends Teacher{
    public static void main(String[] args) {
        Teacher tch = new Teacher();
        //tch.id =12;
        tch.teachClass = 4;
        //tch.degree = "phd";

        MainPackage2 mn  = new MainPackage2();
        mn.studentCount = 100;
    }
}

class NonSubClass extends Teacher{
    public static void main(String[] args) {
        NonSubClass ns = new NonSubClass();
        ns.studentCount = 12;
    }
}