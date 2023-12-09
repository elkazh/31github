package org.example;

public class Constructor {
    public static void main(String[] args) {
        Individual person1 = new Individual();
    }

    class Individual {
        private String name;
        private int age;

        public Individual() {
            this.name = "Имя по умолчанию";
            this.age = 0;
        }

        public Individual(String name) {
            System.out.println("Hello from 2nd constructor");
            this.name = name;
        }

        public Individual(String name, int age) {
            System.out.println("Hello from 3rd constructor");
            this.name = name;
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;

        }
    }
}
