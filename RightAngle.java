package problems;

import java.util.Scanner;

/*
one for loop for rows
 one for loop for col
   soup("*")
soupln()
Input : n = 5
Output: 
* 
* * 
* * * 
* * * * 
* * * * *
*/
public class RightAngle {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
          int row,col;
        
        for ( row = 0; row<n; row++) {

            for(col=0;col<=row;col++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
