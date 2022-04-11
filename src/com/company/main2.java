package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class main2 {
    //zadacha3(1)//
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of flower bed: ");
        double r = sc.nextDouble();
        double area = Math.PI * Math.pow(r, 2);
        double per = 2 * Math.PI * r;
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("Area of flower bed: " + df.format(area));
        System.out.println("Perimeter of flower bed: " + df.format(per));
    }
}

class main32 {
    //zadacha3(2)//
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name");
        String name = scanner.nextLine();
        System.out.println("Where are you live," + name);
        String address = scanner.nextLine();
        System.out.println("Address:" + address + "\n");
        System.out.println("All Info: " + name + ", " + address);
    }
}

class main33 {
    //zadacha3(3)//
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter calls:");
        double s1 = scanner.nextDouble();
        double s2 = scanner.nextDouble();
        double s3 = scanner.nextDouble();
        System.out.println("Enter time:");
        double f1 = scanner.nextDouble();
        double f2 = scanner.nextDouble();
        double f3 = scanner.nextDouble();
        double result1 = s1 * f1;
        double result2 = s2 * f2;
        double result3 = s3 * f3;
        double total = result1 + result2 + result3;
        System.out.println("Result:");
        System.out.println(String.format("s %4.2f %4.2f %4.2f %4.2f", result1, result2, result3, total));

    }
}

class main1 {
    //zadacha1//
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double x = in.nextDouble();
        double y = in.nextDouble();
        if ((a <= 0) || (b <= 0) || (c <= 0) || (x <= 0) || (y <= 0)) {
            System.out.println("The task is not correct");
        } else {
        }
        if (((a < x) && (b < y)) || ((a < y) && (b < x)) || ((a < x) && (c < y)) || ((a < y) && (c < x)) ||
                ((b < x) && (c < y)) || ((b < y) && (c < x))) {
            System.out.println("Yes");
        } else
            System.out.println("No");
    }
}

class main21 {
    //zadacha2(a)//
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nn = scanner.nextDouble();
        double n = Math.pow(nn, 3);
        String Str = new String("The string has the number " + n);
        System.out.println(Str.matches("(.*)3(.*)"));
    }
}

class main22 {
    //zadacha2(b)//
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Reverse number is ");
        StringBuffer rev;
        StringBuffer sb = new StringBuffer(String.valueOf(n));
        rev = sb.reverse();
        System.out.println(rev);
        System.out.println("Reverse number of reversed number is");
        rev = rev.reverse();
        System.out.println(rev);
    }
}



