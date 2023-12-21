package javadev;
import java.util.*;

public class Conditionals {
    public static void main(String[] args){

        //check whether a person is eligible to vote or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if(age>18){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("Yor are not eligible to vote");
        }


        //check whether the number is even or odd.
        System.out.println("Enter any number to check it is even or odd");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }

        //check whether the number is equal greater or lesser
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter your second number");
        int b = sc.nextInt();

        if(a==b){
            System.out.println("a is equal to b");
        }else if(a>b){
            System.out.println("a is greater");
        }else{
            System.out.println("b is greater");
        }



        //print days according to the numbers
        System.out.println("Enter the number to know the day");
        int day = sc.nextInt();

        switch(day){
            case 1:
                System.out.println("Sunday");
                break;

            case 2:
                System.out.println("Monday");
                break;

            case 3:
                System.out.println("Tuesday");
                break;

            case 4:
                System.out.println("Wednesday");
                break;

            case 5:
                System.out.println("Thursday");
                break;

            case 6:
                System.out.println("Friday");
                break;

            case 7:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid day number");
        }

        //calculator according to the number
        System.out.println("Enter the number to perform arithmetic operation \n Enter your first number");
        int x = sc.nextInt();
        System.out.println("Enter your second number");
        int y = sc.nextInt();

        System.out.println("Enter the number according to the action you want to perform \n  1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division");
        int calNum = sc.nextInt();

        switch(calNum){

            case 1:
                System.out.println(x+y);
                break;

            case 2:
                System.out.println(x-y);
                break;
            case 3:
                System.out.println(x*y);
                break;
            case 4:
                System.out.println(x/y);
                break;

            default:
                System.out.println("Invalid number entered");
        }


    }
}
