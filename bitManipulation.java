package javadev;
import java.util.*;

public class bitManipulation {
    public static void main(String [] args){

        //get bit
        int n = 5;
        int pos = 3;
        int bitMask = 1<<pos;
        if((bitMask & n)==0){
            System.out.println("Bit was zero");
        }else {
            System.out.println("Bit was one");
        }


        //set bit
        pos=1;
        bitMask = 1<<pos;
        int newNumber = bitMask | n;
        System.out.println(newNumber);


        //clear bit
        pos = 2;
        bitMask = 1<<pos;
        int not = ~(bitMask);
        newNumber = not & n;
        System.out.println(newNumber);


        //update bit
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 or 0: ");
        int operation = sc.nextInt();

        pos =1;
        bitMask = 1<<pos;
        if(operation ==1){
            newNumber = bitMask | n;
            System.out.println(newNumber);
        }else{
            newNumber = not & n;
            System.out.println(newNumber);
        }


    }
}



/*there are four operation in bit manipulation
1. get bit --> used to know that bit is 0 or 1 on particular place
           bit mask= 1<<i (here i = position)
           operation AND  (bit mask & number)

2. set bit --> used to set 1 at any position
           bit mask = 1<<i (here i = position)
           operation OR    (bit mask || number)

3. clear bit --> used to set 0 at any position
            bit mask = 1<<i (here i = position)
            operation AND with NOT of bit mask  (~bit mask & number)

4. update bit --> used to set any bit at any position
             for setting 0: bit mask = 1<<i (here i = position)
                            operation AND with NOT of bit mask (~bit mask & number)

             for setting 1: bit mask = 1<<i (here i = position)
             operation OR with bit mask (bit mask | number)
*/
