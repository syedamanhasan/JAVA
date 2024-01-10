package javadev;
import java.util.*;
public class twoDArray {

    //2D array input taking and printing the output
    public static void arrayPrint(int [][] numbers, int rows ,int cols){

        //taking input from the user
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.println("Enter your number: ");
                numbers[i][j] = sc.nextInt();
            }
        }
        // printing output
        System.out.println("Your array is: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(" "+numbers[i][j]);
            }
            System.out.println();
        }

    }


    //Linear search in 2D Array
    public static void linearSearch(int [][]array, int row, int col){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.println("Enter your number: ");
                array[i][j] = sc.nextInt();
            }
        }
        // printing output
        System.out.println("Your array is: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(" "+array[i][j]);
            }
            System.out.println();
        }
        System.out.println("Enter the number you want to find: ");
        int x = sc.nextInt();

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(x==array[i][j]){
                    System.out.println("Your number found at: "+i+","+j);
                } 
            }
        }

    }

    //Main function
    public static void main(String[] args){
        //for linear search
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number of rows");
        int row = sc.nextInt();
        System.out.println("Enter your number of columns");
        int col = sc.nextInt();

        int [][]array = new int[row][col];
        //calling linearSearch
        linearSearch(array ,row, col );



    }
}
