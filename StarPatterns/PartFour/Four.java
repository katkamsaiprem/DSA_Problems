package StarPatterns.PartFour;

/*
continuous triangle pattern
1
2 3
4 5 6
7 8 9 10

i       j runs till          output
1           1                  1 
2           2                  23


keep counter before outer loop
 */
public class Four {

    void main() {

        int counter = 1;

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter++ + " ");
            }
            System.out.println();

        }
    }

}
