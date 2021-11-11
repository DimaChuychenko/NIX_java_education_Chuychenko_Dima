package nix.education.java.coffeemachine;

import java.util.Scanner;

public class CoffeeMachine extends Calculate {
    public static void main(String[] args) {
        Output();
        paymant();
        logic();
    }


    private static void Output(){
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
    }


    private static void paymant() {
        System.out.println("Write how many cups of coffee you will make:");
        Scanner scanner = new Scanner(System.in);
        Calculate calculate = new Calculate();
        int num = scanner.nextInt();
        System.out.println("For " + num + "cups of coffee you will need:");
        System.out.println(num * calculate.someMilk + "ml of milk");
        System.out.println(num * calculate.someWater + "ml of water");
        System.out.println(num * calculate.someCoffeeBeans + "g of coffee beans");
    }


    private static void logic() {
        Calculate calculate = new Calculate();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int numWater = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int numMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int numCoffee = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will make:");
        int num = scanner.nextInt();
        int possibleCups;
        if (num != -1) {
            int divWater = numWater / calculate.someWater,
                    divMilk = numMilk / calculate.someMilk,
                    divCoffee = numCoffee / calculate.someCoffeeBeans;
            possibleCups = Math.min(divCoffee, Math.min(divMilk, divWater));
            if (num > possibleCups) {
                System.out.println("No, I can make only " + possibleCups + " cups of coffee");
            } else if ((possibleCups - num) != 0) {
                System.out.println("Yes, I can make that amount of coffee (and even " + (possibleCups - num) + " more than that)");
            } else System.out.println("Yes, I can make that amount of coffee");
        }

    }


}