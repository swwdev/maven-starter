package org.example;


public class Main
{
    public static void main(String[] args) {
        Integer result = Calculator.add(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        System.out.println(result);
    }
}
