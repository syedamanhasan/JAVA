package javadev;
import java.util.*;

public class Loops {
    public static void main(String[] args){

        for(int i=0; i<=2; i++){
            System.out.println("Hi Aman, You are doing great");
        }

        //print the numbers from 0 to 10 with for loop.
        System.out.println("Doing with for loop:");
        for(int i=0; i<=10; i++){
            System.out.print(i +" ");
        }
        System.out.println();

        //print 0 to 10 with while loop
        System.out.println("Doing with while loop:");

        int i=0;
        while(i<=10){
            System.out.print(i +" ");
            i++;
        }

        System.out.println();

        System.out.println("Doing with do while loop");

        int j=0;
        do{
            System.out.print(j + " ");
            j++;
        }while(j<=10);

        //print the sum of first n natural numbers.
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        int sum=0;
        for( int k=1; k<=n; k++){
            sum=sum+k;
        }
        System.out.println(sum);
        System.out.println();

        //print the table of n number.
        int mul=1;
        for(int a=1; a<=10; a++){
            System.out.println(n+" * "+a+" = "+n*a);
        }

        //print all even numbers till n.
        System.out.println();
        for(int b=0; b<=n; b+=2){
            System.out.println(b);
        }
        System.out.println();

        //take input marks from the user if marks > 80 print very good, if marks <80 but > 60 print good else average marks. if user enters 1 keep taking inputs and if it enters 0 then stop.
        int input;
        do{
            System.out.println("Enter marks");
            int marks = sc.nextInt();
            if(marks>=80)
                System.out.println("Very Good");
            else if(marks<80 && marks>60)
                System.out.println("Good");
            else if(marks<60)
                System.out.println("Average");
            else
                System.out.println("Invalid marks");

            System.out.println("Want to continue with marks?\n Yes(1) and No(0)");
            input = sc.nextInt();
        }while(input==1);

        System.out.println();
        




    }
}
