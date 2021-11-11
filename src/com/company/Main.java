package com.company;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println(number(generateAge(), 17));
        System.out.println(number(generateAge(), 33));
        System.out.println(number(generateAge(), 28));
        System.out.println(number(generateAge(), 36));
        System.out.println(number(generateAge(), 42));

    }

    public static String number(int ageOfThePerson, int temperature) {
        if (ageOfThePerson >= 20 && ageOfThePerson <= 45 && temperature >= -20 && temperature <= 30) {
            return "можно идти гулять";
        } else if (ageOfThePerson < 20 && temperature <= 28) {
            return "можно идти гулять";
        } else if (ageOfThePerson > 45 && temperature >= -10 && temperature <= 25) {
            return "можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
    public static int generateAge() {
        int age;
        Random random = new Random();
        age = random.nextInt(50);
        return age;
    }
}