package com.company;
import java.util.Scanner;
public class lab1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = in.nextInt();
        System.out.print("Input b: ");
        int b = in.nextInt();
        System.out.print("Input c: ");
        int c = in.nextInt();
        System.out.print("Input d: ");
        int d = in.nextInt();
        if ((a < b) && (a < c) && (a < d)) {
            System.out.println(a);
        } else if ((b < a) && (b < c) && (b < d)) {
            System.out.println(b);
        } else if ((c < a) && (c < b) && (c < d)) {
            System.out.println(c);
        } else if ((d < a) && (d < b) && (d < c)) {
            System.out.println(d);
        }
    }
}
