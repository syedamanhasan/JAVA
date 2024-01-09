package javadev;
import java.util.*;
public class arrays {

    public static void printArrayByLoop(int[] marks) {
        marks[0] = 94;
        marks[1] = 79;
        marks[2] = 86;
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);

        //printing array by loop

        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }
    }


    //taking array as an input from the user by loop
    public static void inputArrayByLoop(int arr[]){

        //taking input by loop
        Scanner sc = new Scanner(System.in);
        //taking inputs with loop
        for(int i=0; i<4; i++){
            System.out.println("Enter your number");
            arr[i] = sc.nextInt();
        }
        //printing outputs from loops
        for(int i=0; i<4; i++){
            System.out.println(arr[i]);
        }
    }


    public static void takingSizeByUser(int numbers[], int size){

        for(int i = 0; i<size; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your number");
            numbers[i] = sc.nextInt();
        }

        for(int i=0; i<size; i++){
            System.out.println(numbers[i]);
        }
    }

    public static void linearSearch(int array[] , int size){
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<size; i++){

            System.out.println("Enter the number: ");
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the number you want to search");
         int num = sc.nextInt();

        for(int i=0; i<size; i++){
            if(array[i]==num){
                System.out.println("Your number found at: "+i);
                break;
            }
        }
    }






    public static void main(String[] args) {
//        //calling function
//        int [] marks = new int[3];
//        printArrayByLoop(marks);
//
//        //calling function
//        int [] arr = new int[4];
//        inputArrayByLoop(arr);
//
//        //calling function
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of an array");
//        int size = sc.nextInt();
//        int[] numbers = new int[size];
//        takingSizeByUser(numbers,size);

        //calling function
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int [] array = new int[size];
        linearSearch(array,size);

    }
}


