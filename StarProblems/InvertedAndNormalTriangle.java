package Starproblems;

/*
10.Write a program in Java to display the following pattern 
*****
****
***
**
*
**
***
****
*****
----------------------------

 */
public class InvertedAndNormalTriangle {

    public static void main(String[] args) {
        int maxRowsAndColoumns = 5;

        for (int row = 0; row < maxRowsAndColoumns; row++) {
            for (int col = maxRowsAndColoumns - row; col > 0; col--) {
                //col is max iteretions and col -- decreases itereations, col is starting value
                System.out.print("*");

            }
            System.out.println();
        }
        for (int row = 0; row < maxRowsAndColoumns; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }

}
