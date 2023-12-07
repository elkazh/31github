package org.example;

public class Methods {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setNameAndAge("Chris", 20);
        person1.sayHello();
        String s1 = "Kate";
        Person person2 = new Person();
        person2.setNameAndAge(s1, 15);
        person1.speak();
        person2.speak();
        person2.sayHello();
        int year1 = person1.calculateYearToRetirement();
        int year2 = person2.calculateYearToRetirement();
        System.out.println("Age of the first person till to retirement: " + year1+" years");
        System.out.println("Age of the second person till to retirement: " + year2+" years");

    }
}

    class Person {
        String name;
        int age;

        void setNameAndAge(String username, int userage){
            name = username;
            age = userage;
        }

        int calculateYearToRetirement(){
            int years = 65 - age;
            return years;
        }

        void speak() {
            for (int i = 0; i < 3; i++) {
                System.out.println("My name is " + name + ", I am " + age + " years old");
            }
        }

        void sayHello() {
            System.out.println("Hello");
        }

    }


