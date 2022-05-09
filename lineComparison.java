package com.bridgelabz.OOPs;

import java.util.Scanner;

class point {
    static int x1 = 0;
    static int y1 = 0;
    static int x2 = 0;
    static int y2 = 0;
    static int a1 = 0;
    static int b1 = 0;
    static int a2 = 0;
    static int b2 = 0;

    public static void getcoordinates() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Coordinates for Line-1");
        System.out.println("Enter the x1 Co-oridnates : ");
        x1 = sc.nextInt();

        System.out.println("Enter the y1 Co-oridnates : ");
        y1 = sc.nextInt();

        System.out.println("Enter the x2 Co-oridnates : ");
        x2 = sc.nextInt();

        System.out.println("Enter the y2 Co-oridnates : ");
        y2 = sc.nextInt();

        System.out.println("Enter the x3 Co-oridnates : ");
        a1 = sc.nextInt();

        System.out.println("Enter the y3 Co-oridnates : ");
        b1 = sc.nextInt();

        System.out.println("Enter the x3 Co-oridnates : ");
        a2 = sc.nextInt();

        System.out.println("Enter the y4 Co-oridnates : ");
        b2 = sc.nextInt();

    }
}
class Line extends point {
    static Double Len1 = 0.0;
    static Double Len2 = 0.0;

    public void Length() {
        Len1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        Len1 = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));

        System.out.println("Length of Line 1 is: " + Len1);
        System.out.println("Length of Line 2 is: " + Len2);
    }

    public void LineEquality() {
        if (Len1.equals(Len2))
            System.out.println("Lines are equal");
        else {
            System.out.println("Lines are not equal");
        }
    }
    public void LineCompare() {
        int compareValue = Len1.compareTo(Len2);
        if (compareValue == 0) {
            System.out.println("len1 and len2 are equal");
        } else if (compareValue < 0) {
            System.out.println("len1 is less than len2");
        } else {
            System.out.println("len1 is greater than len2");
        }
    }
}

public class lineComparison {
        public static void main(String[] args) {
            System.out.println("Welcome to Line Comparison Computation");

            Line line = new Line();
            line.getcoordinates();
            line.Length();
            line.LineEquality();
            line.LineCompare();
        }
    }
