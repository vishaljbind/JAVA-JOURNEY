package Packages.LearnPackages;

import Packages.LearnEncapsulation.MainEncapsulation;

public class MainClass {
    public static void main(String[] args) {
        Teacher tch = new Teacher();
        tch.teachClass = 12;
        //tch.id = 123;
        tch.degree = "bsc.";

        MainEncapsulation.printHello();
    }
}
