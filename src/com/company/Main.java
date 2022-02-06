package com.company;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    static void convertTemp(double temp){
        var celsius = (temp-32) * 5/9;
        System.out.println(celsius + "C");
    }
    public static void main(String[] args) {
        int fahre;
        do{
            System.out.println("Enter a temperature in Fahrenheit");
            int fahre1 = input.nextInt();
            fahre = fahre1;
            convertTemp(fahre);
        }while(fahre >= -460);
    }
}

