package PartFive;

/*
*****
 ****
  ***
   **
    *
 
row 0 print star when j >= row 0
row 1 print star when j >= row 1
row 2 print star when j >= row 2


 
 */
public class Six {

    void main() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
