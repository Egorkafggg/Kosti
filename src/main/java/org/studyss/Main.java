package org.studyss;

import java.util.Scanner;

public class Main {
    public static int comprand() {
        return (int) (Math.random() * 100);
    }

    public static void main(String[] args) {

        int compnumber = comprand();
        int numperson;
        int res;
        boolean sswitch=true;
        int attempts=0;

        Scanner sc = new Scanner(System.in);
        while (sswitch) {
            System.out.println("Число загадано, что это за число?");
            numperson = sc.nextInt();
            if (compnumber == numperson) {
                System.out.println("Вы угадали!!!ТЫ красава!");
                sswitch = false;

            } else if (compnumber > numperson) {
                System.out.println("Я сам в шоке, но загаданное число больше, брат");
                attempts++;

            } else {
                System.out.println("Не ожидал от тебя такого. Загаданное число меньше, брат");
                attempts++;
            }

        }
        System.out.println("Количество попыток: "+attempts+" Загаданное число: "+compnumber);
    }
}
