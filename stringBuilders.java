package javadev;

public class stringBuilders {
    public static void main(String [] args){
        StringBuilder sb = new StringBuilder("Aman");
        System.out.println(sb);

        System.out.println(sb.charAt(0));
        //setting character
        sb.setCharAt(1,'y');
        System.out.println(sb);
        //inserting character
        sb.insert(1, 'h');
        System.out.println(sb);
        //deleting character
        sb.delete(1,2);
        System.out.println(sb);
        //adding substring at the end of the string
        sb.append("aman");
        System.out.println(sb);

        //reversing the string
        StringBuilder he = new StringBuilder("Hello");

        for(int i = 0; i<he.length()/2; i++){
            int front = i;
            int back = he.length()-1-i;

            char frontChar = he.charAt(front);
            char backChar = he.charAt(back);

            he.setCharAt(front, backChar);
            he.setCharAt(back, frontChar);
        }
        System.out.println(he);
    }
}

// stringName.setCharAt(index, 'character') --> change the present character with the given character.
//stringName(index, 'character') --> insert the character at the given index
// stringName.delete(starting index, ending index) --> delete the substring from the starting index to the ending index(ending index is not included)
//stringName.append('character') --> adds the given character at the end of the string.