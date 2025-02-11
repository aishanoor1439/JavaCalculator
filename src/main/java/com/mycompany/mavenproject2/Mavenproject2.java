package com.mycompany.mavenproject2;

import java.util.Scanner;

public class Mavenproject2 {

//    Method to add numbers
    static void addNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        double a = input.nextDouble();
        System.out.println("Enter second number:");
        double b = input.nextDouble();
        double c = a + b;
        System.out.println(c);
    }
    
//    Method to subtract numbers
    static void subNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        double a = input.nextDouble();
        System.out.println("Enter second number:");
        double b = input.nextDouble();
        double c = a - b;
        System.out.println(c);
    }
    
//    Method to multiply numbers
    static void multNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        double a = input.nextDouble();
        System.out.println("Enter second number:");
        double b = input.nextDouble();
        double c = a * b;
        System.out.println(c);
    }
    
//    Method to divide numbers
    static void divNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        double a = input.nextDouble();
        System.out.println("Enter second number:");
        double b = input.nextDouble();
        double c = a / b;
        System.out.println(c);
    }
    
//    Method to calculate remainder
    static void calRemainder() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        double a = input.nextDouble();
        System.out.println("Enter second number:");
        double b = input.nextDouble();
        double c = a % b;
        System.out.println(c);
    }
    
//    Method to calculate power of a number
    static void calPower() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base number:");
        double a = input.nextDouble();
        System.out.println("Enter exponent number:");
        double b = input.nextDouble();
        double c = Math.pow(a, b);
        System.out.println(c);
    }
    
//    Method to calculate square root
    static void calSqrt() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        double a = input.nextDouble();
        double c = Math.sqrt(a);
        System.out.println(c);
    }
    
//    Method to calculate
    static void calFactorial() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        long a = input.nextInt();
        long factorial;
        if (a == 0 || a == 1) {
            factorial = 1;
        } else {
            factorial = a * calFactorial(a - 1);
            return factorial;
        }
                    System.out.println(factorial);
    }

    public static void main(String[] args) {
        String response;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Which operation(+, -, *, /, %, ^, √, factorial) do you want to perform?");
            String reply = input.next();
            switch (reply) {
                case "+":
                    addNumbers();
                    break;
                case "-":
                    subNumbers();
                    break;
                case "*":
                    multNumbers();
                    break;
                case "/":
                    divNumbers();
                    break;
                case "%":
                    calRemainder();
                    break;
                case "^":
                    calPower();
                    break;
                case "√":
                    calSqrt();
                    break;
                case "factorial":
                    calFactorial();
                    break;
                default:
                    System.out.println("NO such operation available!");
            }
            System.out.println("Do you want to continue?");
            response = input.next().toLowerCase();
        } while (response == "yes");
    }
}
