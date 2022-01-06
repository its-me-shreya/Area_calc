package com.cognizant.shapes;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a=s.nextInt();
        int b=s.nextInt();
        AreaCalculator met=new AreaCalculator();
        int res=met.calculateArea(a, b);
        System.out.println("The Area of the rectangle is calculated using the formula length * breadth:"+res);
        s.close();
    }
}
class AreaCalculator{
    public int calculateArea(int x,int y) {
        return x*y;
    }
}