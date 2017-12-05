package com.company;

public class Main {

    public static void main(String[] args) {
        int num0 = 0;
        int num1 = 1;
        int num3;
        for (int i = 0; i < 20; i++) {
            num3 = num0 + num1;
            System.out.print(num1 + " ");
            num0 = num1;
            num1 = num3;
        }
        System.out.print(" ");
    }
}
