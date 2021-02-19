package com.example.helloworld;

public class HelloWorld {
    public static void main(String[] args) {
        int count = 5;
        System.out.println(count);
        int y = 5;
        System.out.println("Multiplication");
    }

    public static int multiply(int num1, int num2)
    {
        //TODO
        return num1*num2;
    }

    public static int sum(int num1, int num2)
    {
        return num1+num2;
    }

    public static int substract(int num1, int num2)
    {
        return num1 - num2;
    }

    public static void printHello()
    {
        System.out.println("Hello");
    }
}
