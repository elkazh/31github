package org.example;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите что-нибудь");
        String string = s.nextLine();
        System.out.println("Вы ввели " + string);
    }
}
