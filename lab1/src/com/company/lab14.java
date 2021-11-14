package com.company;
import java.util.Scanner;
public class lab14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input month: ");
        int month = in.nextInt();
        if((month == 1) ||  (month == 2) || (month == 12)) {
            System.out.println("Winter");
        } else if ((month >= 3) && (month <= 5)) {
            System.out.println("Spring");
        } else if ((month >= 6) && (month <= 8)) {
            System.out.print("Summer");
        } else if ((month >= 9) && (month <= 11)) {
            System.out.print("Autumn");
        } else {
            System.out.print("Input number from 1 to 12");
        }
    }
}
