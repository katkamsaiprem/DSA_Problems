package StarPatterns.PartFour;

/*
Dry run

right angled number triangle row wise

1
22
333
4444

i    j runs till output
1      1          1



*/

public class Two {

    void main() {

        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();

        }
    }

}
