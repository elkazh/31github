package org.example;

public class ClassesAndObjects {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = "Chris";
        person1.age = 50;
        System.out.println("My name is "+person1.name+ ","+ "I am "+person1.age);
        Person person2 = new Person();
        person2.name = "Kate";
        person2.age = 25;
        System.out.println("My name is "+person2.name+ ","+ "I am "+person2.age);

    }
}
class Person{
    String name;
    int age;

}
