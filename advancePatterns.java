package javadev;

public class advancePatterns {
    public static void main(String[] args){
        //Butterfly pattern
        int n=4;
        System.out.println("Butterfly Pattern");
        //Upper part
        //outer loop
        for(int i=1; i<=n; i++){
            //left side stars
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            //spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
            }
            //right stars
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // lower part outer loop
        for(int i=n; i>=1; i--){
            //left side stars
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            //spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
            }
            //right stars
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //Diamond
        System.out.println();
        System.out.println("Diamond");
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            //stars
            for(int j=1; j<=2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Lower part
        for(int i=n; i>=1; i--){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            //stars
            for(int j=1; j<=2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        //Hollow Butterfly
        System.out.println();
        System.out.println("Hollow Butterfly");
        //Upper part
        //outer loop
        for(int i=1; i<=n; i++){
            //left side stars
            for(int j=1; j<=i; j++){
                if(j==1||j==i)
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            //spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //right stars
            for(int j=1; j<=i; j++){
                if(j==1||j==i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // lower part outer loop
        for(int i=n; i>=1; i--){
            //left side stars
            for(int j=1; j<=i; j++){
                if(j==1||j==i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            //spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //right stars
            for(int j=1; j<=i; j++){
                if(j==1||j==i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }


        //Hollow Rhombus
        System.out.println();
        System.out.println("Hollow Rhombus");
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=n; j++){
                if(i==1||j==1||i==n||j==n)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

        //Half Pyramid
        System.out.println();
        System.out.println("Half Pyramid");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }


        //Inverted Half Pyramid
        System.out.println();
        System.out.println("Inverted Half Pyramid");
        int num =1;
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(num);
            }
            System.out.println();
            num++;
        }

    }
}
