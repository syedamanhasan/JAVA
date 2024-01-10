package javadev;
import java.util.*;

public class strings {
    public static void main(String [] args){
        String str1 = new String("Syed Aman Hasan");
        System.out.println("Your string is: "+ str1);

        //taking string as an input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you want to enter");
        String str = sc.nextLine();
        System.out.println("Your string is: "+str);

    }
}

/*
Methods of String
let String name = "Aman";

1. name.length() --> Returns the length of the String.
2. name.toLowerCase() --> Returns the string with all lower case letters.
3. name.toUpperCase() --> Returns the string with all upper case letters.
4. name.trim() --> Returns a new string after removing all the heading and tailing spaces from the original string.
5. name.substring(int start) --> Returns a substring from given index to the end of the string.
6. name.substring(int start, int end) --> Returns a substring from the given starting index to the given ending index. Here start index in included and end index is excluded.
7. name.replace('m','s') --> Returns the new string after replacing m to s.
8. name.startsWith("Am") --> Returns true if the string stars with Am else false.
9. name.endsWith("an") --> Returns true if the string ends with an otherwise false.
10. name.chatAt(int 2) --> Returns the character present at the given index.
11. name.indexOf("Am") --> Returns the index of the first occurance of the given string.
12. name.indexOf("a", 3) --> Return the index of the given string after the given position of index. If not found, returns -1.
13. name.lastIndexOf("an") --> Returns the last index of the given string.
14. name.lastIndexOf("m", 2) --> Returns the last index of the given string before the given index position.
15. name.equals("Aman") --> Returns true if the given string is equal to the original string.(case sensitive)
16. name.equalsIgnoreCase("Aman") --> Returns true if the given string is equal to the original string.(ignores case sensitivity)
*/