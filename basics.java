package javadev;
import java.util.*;
public class basics {
    public static void main(String [] args){

        //print statements
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.print("Hello World\n");
        System.out.println("Hello World");


        //variables and data types
        int a = 20;
        int b=10;
        int sum = a+b;
        System.out.println(sum);
        int difference = a-b;
        System.out.println(difference);


        //taking inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        int x = sc.nextInt();
        System.out.println("Enter your second number");
        int y= sc.nextInt();
        System.out.println(x+y);

    }
}


/*  \n and println is used to print and give a new line
     data types: primitive and non-primitive

      primitive:- byte, short, char, boolean, int, log, float, double
      non-primitive:- String, array, class, object, interface

      */


