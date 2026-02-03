package StarPatterns.PartFour;

/*

i       j runs till  output
1           1          *
2           2          **
3           3          ***
4           4          ****







 */
public class One {

    void main() {

        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

}
