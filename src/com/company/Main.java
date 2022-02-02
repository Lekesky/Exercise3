package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a temperature in Fahrenheit");


    }

    static void convertTemp(double temp){
        var celsius = (temp-32) * 5/9;
        System.out.println(celsius + "C");
    }
}

