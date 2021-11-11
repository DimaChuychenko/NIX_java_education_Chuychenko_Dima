package nix.education.java.chatbot;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        System.out.println("Hello! My name is Cat.");
        System.out.println("I was created in 2021.");

        System.out.println("Please, remind me your name.");
        Scanner scanner = new Scanner(System.in);
        String myName = scanner.next();
        System.out.println("What a great name you have, " + myName + "!");

        System.out.println("Let me Guess your age.");
        System.out.println("Enter remainders of dividing your age by 3,5 and 7.");
        int age;
        int remainder3, remainder5, remainder7;
        remainder3 = scanner.nextInt();
        remainder5 = scanner.nextInt();
        remainder7 = scanner.nextInt();
        age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + age + ": that's a good time to start programming!");

        System.out.println("Now I will prove to you that I can count to any number you want.");
        int count = scanner.nextInt();
        for(int i = 0; i <= count; i++){
            System.out.println(i + " !");
        }

        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");

        int answer;
        do {
            answer = scanner.nextInt();
            if (answer == 2) {
                System.out.println("Great you right!");
                System.out.println("Goodbye, have a nice day!");
                break;
            } else {
                System.out.println("Please, try again");
            }
        }
        while (true);
    }
}

