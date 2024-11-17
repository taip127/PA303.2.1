package com.perscholas.java_basics;

import static java.lang.Integer.sum;

public class JavaBasicClass {
    public static void main(String[] args) {
        int xx = 5;
        int yy = 10;
        int total = sum(xx, yy);
        System.out.println("The sum result of two integers is: " + total);

        double a = 5.5;
        double b = 10.7;
        double total1 = a +b; // the sum must be also a double variable
        System.out.println("The sum result of two doubles is: " + total1);

        int j = 6;
        int o = 12;
        int Divide = 12/6;
        System.out.println("The divide result of two integers is: " + Divide);
        // When change the larger number is decimal give an error because we cant use decimal with interger variable type.

        double t = 1.2;
        double g = 2.4;
        double Divide2 = g/t;
        System.out.println("The divide result of two doubles is: " + Divide2);
        System.out.println("The divide result of two doubles cast as integer is: " + (int)Divide2);


        int x =5;
        int y =6;
        int q = y/x;
        System.out.println(" q result as integer : " + q);

        double qAsdouble = (double)y/x;
        System.out.println(" q result when cast y as double : " + qAsdouble);

        final double PI = 3.14;
        System.out.println("2*PI is: "+ PI*2);

        double coffee = 5.99;
        double tea = 3.99;
        double milk = 2.99;

        double order = 3*coffee + 4*tea + 2*milk;

        double subTotal = order;
        System.out.printf("The Subtotal is : $%.2f%n" , subTotal);
        final double  SALES_TAX = 0.0825;
        double totalSale = subTotal+ subTotal*SALES_TAX;
        System.out.printf("Total sale after tax is: $%.2f%n" , totalSale);







    }



}
