package javadev;
import java.util.*;

public class funtions {

    //Funtion to print the name
    public static void printMyName(String name){
        System.out.println("Your name is: "+name);
        return;
    }

    //Function to add two numbers
    public static int calculateSum(int a, int b){
        return a+b;
    }

    //function to multiply two numbers
    public static int claculateMul(int a, int b){
        int mul = a*b;
        return mul;
    }

    //function for factorial of a number
    public static double calculateFactorial(int a){
        int factorial = 1;
        if(a<0)
            System.out.println("Invalid number for factorial");
        else {
            for (int i = a; i >= 1; i--){
                factorial = factorial * i;
            }
        }
        return factorial;
    }


    //function to check a number is even or odd
    public static void evenOrOdd(int a){
        if(a%2==0)
            System.out.println("First number is even");
        else
            System.out.println("First number is odd");
    }


    //function to print a table
    public static void printTable(int a){
        for(int i=1; i<=10; i++){
            System.out.println(a+" * "+i+" = "+a*i);
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        printMyName(name);  //function calling


        System.out.println("Enter your first number");
        int a = sc.nextInt();
        System.out.println("Enter your second number");
        int b = sc.nextInt();
        System.out.println("Addition of your number is: "+calculateSum(a, b));

        int mul=claculateMul(a,b);
        System.out.println("Multiplication of your number is: "+mul);

        System.out.println("Factorial of the first number is: "+calculateFactorial(a));

        evenOrOdd(a);

        printTable(a);


    }
}
