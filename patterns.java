package javadev;

public class patterns {
    public static void main(String[] args){
        //Solid Rectangle
        System.out.println("Solid Rectangle");
        int n=4, m=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //Hollow Rectangle
        System.out.println();
        System.out.println("Hollow Rectangle");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(j==1 || j==m || i==1 || i==n)
                System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        // Half Pyramid
        System.out.println();
        System.out.println("Half Pyramid");
        int a =4;
        for(int i=1; i<=a; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //Inverted Half Pyramid
        System.out.println();
        System.out.println("Inverted Half Pyramid");
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        //Inverted Half Pyramid(Rotated by 180 deg)
        System.out.println();
        System.out.println("Inverted Half Pyramid(Rotated by 180 deg)");
        //outer loop
        for(int i=1; i<=n; i++) {
            //spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        //Half Pyramid with Numbers
        System.out.println();
        System.out.println("Half Pyramid with Numbers");
        a=5;
        for(int i=1; i<=a; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }


        //Inverted Half Pyramid with Numbers
        System.out.println();
        System.out.println("Inverted Half Pyramid with numbers");
        for(int i=a; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }


        //Floyd's Triangle
        System.out.println();
        System.out.println("Floyd's Triangle");
        int num=1;
        for(int i=1; i<=a; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }

        //0-1 Triangle
        System.out.println();
        System.out.println("0-1 Triangle");
        for(int i=1; i<=a; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        //Solid Rhombus
        System.out.println();
        System.out.println("Solid Rhombus");
        for(int i=1; i<=a; i++){
            //spaces
            for(int j=1; j<=a-i; j++){
                System.out.print("  ");
            }
            //stars
            for(int j=1; j<=a; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //Number Pyramid
        System.out.println();
        System.out.println("Number Pyramid");
        for(int i=1; i<=a; i++){
            //spaces
            for(int j=1; j<=a-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        //Palindromic Number Pyramid
        System.out.println();
        System.out.println("Palindromic Number Pyramid");
        for(int i=1; i<=a; i++){
            //spaces
            for(int j=1; j<=n-i+1; j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
