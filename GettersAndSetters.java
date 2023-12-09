package org.example;

public class GettersAndSetters {
    public static void main(String[] args) {
        PersonInfo person1 = new PersonInfo();
        person1.setName("");
        person1.setAge(-4);
        System.out.println("Show result in main method: " + person1.getName());
        System.out.println("Show result in main method: " + person1.getAge());

    }
}

class PersonInfo{
    private String name;
    private int age;

    void setName(String username) {
        if (username.isEmpty()) {
            System.out.println("You don't write your name");
        } else {
            name = username;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        if (userAge < 0) {
            System.out.println("Age should be positive");
        } else {
            age = userAge;
        }
    }

    public int getAge() {
        return age;

    }

    int calculateYearToRetirement() {
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


