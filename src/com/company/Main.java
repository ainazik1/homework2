package com.company;

import java.awt.desktop.SystemSleepEvent;
public class Main {

    public static void main(String[] args) {
        System.out.println(number(34,17));
        System.out.println(number(28,33));
        System.out.println(number(47,28));
        System.out.println(number(52,36));
        System.out.println(number(16,42));

    }

    public static String number (int ageOfThePerson, int temperature) {
        if (ageOfThePerson >= 20 && ageOfThePerson <= 45 && temperature >= -20 && temperature <= 30) {
            return "можно идти гулять";
        } else if (ageOfThePerson < 20 && temperature <= 28) {
            return "можно идти гулять";

        } else if (ageOfThePerson >  45 && temperature >= -10 && temperature <=25)  {
             return "можно идти гулять";

        } else {
            return "Оставайтесь дома";
        }
    }
}