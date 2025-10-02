package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter one whole number?");
        int numberOne = scanner.nextInt();
        System.out.println("Enter another whole number?");
        int numberTwo = scanner.nextInt();

       sumNumbers(numberOne,numberTwo);



    }
    public static void sumNumbers(int num1, int num2){
        System.out.println("The sum is " + (num1 + num2));



    }

}
