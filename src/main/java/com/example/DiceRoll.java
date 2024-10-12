package com.example;

import java.util.Random;
import java.util.Scanner;

public class DiceRoll {
    public static void main(String[] args) {
        System.out.println("Käyttäjä: Zehra Ghalia");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kuinka monta noppaa haluat heittää? ");
        int numberOfDice = scanner.nextInt();
        int sum = rollDice(numberOfDice);
        System.out.println("Noppahdollisen summa on: " + sum);
        scanner.close();
    }

    public static int rollDice(int numberOfDice) {
        Random random = new Random();
        int sum = 0;
        for (int i = 1; i <= numberOfDice; i++) {
            int roll = random.nextInt(6) + 1;  // Heitetään noppaa (1-6)
            sum += roll;
        }
        return sum;
    }
}
