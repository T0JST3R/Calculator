package com.kodilla.calculator;

public class Calculator {
    public int addAtoB(int a , int b){
        return a+b;
    }
    public int substractAfromB(int a , int b){
        return a-b;
    }
}

class Test{
    public static void main(String[] args) {
        Calculator test = new Calculator();

        int result1 = test.addAtoB(2, 4);
        int result2 = test.substractAfromB(6 ,3);
        System.out.println("Wynik dodawania to " + result1 + "\n Wynik odejmowania to "+ result2);

    }
}