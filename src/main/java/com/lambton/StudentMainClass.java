
package com.lambton;
import java.util.Date;
public class StudentMainClass {
    public static void main(String[] args) {
        Student s1=new Student(777,"Anmol","Singh",new Date(1997,11,15),Gender.Male);
        s1.setSubject1(65);
        s1.setSubject2(99);
        s1.setSubject3(65);
        s1.printData();
        System.out.println();
        Student s2= new Student(881,"inshant","tageja",new Date(1996,10,04),Gender.Male);
        s2.setSubject1(77);
        s2.setSubject2(66);
        s2.setSubject3(55);
        s2.printData();
        System.out.println();
    }
}

