package Packages.LearnEncapsulation;

import Packages.LearnPackages.Person;

public class MainEncapsulation {

    public static void printHello(){
        System.out.println("Hello word");
    }
    public static void main(String[] args) {

        MainEncapsulation.printHello();
        Person ps = new Person();
        ps.setAge(12);
        System.out.println(ps.getAge());
        ps.count = 50;
        System.out.println(ps.count);

        Person ps2 = new Person();
        System.out.println(ps2.count);
        Person.count = 80;


    }
}
