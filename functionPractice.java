package javadev;
import javax.net.ssl.HostnameVerifier;
import java.util.*;
public class functionPractice {

    //average of three numbers
    public static int average(int a, int b, int c)
    {
        int average = (a+b+c)/3;
        return average;
    }


    //sum of all odd numbers from 1 to n
    public static int sumsOdd(int a){
        int sum=0;
        for(int i=1; i<=a; i++){
            if(i%2!=0)
                sum = sum+i;
        }
        return sum;
    }


    //greater among two numbers
    public static void greater(int a,int b){
        if(a>b) System.out.println("a is greater");
        else if (b>a) System.out.println("b is greater");
        else System.out.println("a and b are equal");

    }

    //circumference of circle by radius
    public static double circumference(int a){
         return 2 * 3.14 * a;
    }


    //counting of different numbers
    public static void count(boolean x){
        int positive=0;
        int negative = 0;
        int zero = 0;
        int input;
        int user;
        do{

            System.out.println("Enter your number");
            Scanner sc = new Scanner(System.in);
            input = sc.nextInt();
            if(input>0) positive = positive+1;
            else if(input<0) negative = negative+1;
            else if(input==0) zero= zero +1;
            else System.out.println("Invalid number");


            System.out.println("want to continue1  0");
            user = sc.nextInt();

        }while(user==1);
        System.out.println("Total positive numbers are:  "+positive);
        System.out.println("Total negative numbers are: "+negative);
        System.out.println("Total zeros are: "+zero);
    }


    //find power of x to n
    public static double calPower(int a, int b){
        double cal=1;
        for(int i=1; i<=b; i++){
            cal = cal*a;
        }
        return cal;
    }


    //fibonacci series
    public static int fibonacci(int a){
        int first=1;
        int second=1;
        int next;
        System.out.print(first +" "+second);
        for(int i=1; i<=a; i++){
           next=first+second;
            System.out.print(" "+next);
           first=second;
           second=next;

        }
        return 0;
    }


    //Greatest Common Divisor of numbers
    public static int gcd(int a, int b){
        int gcd = 1;
        for(int i=1; i<=a && i<=b; i++){
            if(a%i ==0 && b%i ==0)
                gcd=i;
        }
        return gcd;
    }






    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //average function calling
        int average = average(a, b, c);
        System.out.println("Average of your three numbers is: " + average);


        //sumsOdd function calling
        int sum = sumsOdd(a);
        System.out.println("Sum of all odd number till a is: " + sum);

        //greater function calling
        greater(a, b);

        //circumference function calling
        System.out.println("Circumference of a circle by radius a is: " + circumference(a));

        //count function calling
        boolean x = true;
        count(x);


        //calling calPower
        System.out.println("Power of " + a + "^" + b + " = " + calPower(a, b));


        //calling of fibonacci
        System.out.println("Fibonacci till " + a + " is: ");
        fibonacci(a);
        System.out.println();


        //calling gcd function
        System.out.println("The greatest common divisor of " + a + " and " + b + " is: " + gcd(a, b));

    }
}
