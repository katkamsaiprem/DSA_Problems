package PartFive;

/*
    *
   **
  ***
 ****
*****
it is 5x5 square that contains spaces and stars on each row


col>=n- row -1
n=5
1>=5-1-1
5>=5 print star

5>=5-2-1  outerloop second iteration
5>=4

on row 0 -> we need to print star on 4 iteration 
on row 1 -> we need to print star on 3 and 4 iteration , 


row 0 : star when j == 4
row 1   star when j>=3
 */
public class five {

    void main() {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j >= 5 - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
