package javadev;

public class insertionSort {

    public static void main(String[] ags){

        int [] array = {7,8,3,1,2};
        //Insertion sort
        for(int i=1; i<array.length; i++){
            int current = array[i];
            int j = i-1;
            while(j>=0 && current < array[j]){
                array[j+1] = array[j];
                j--;
            }


            //placement
            array[j+1] = current;
        }

        //printing the array
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }


    }

}
