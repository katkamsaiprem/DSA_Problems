package PartFive;

/*
1234
123
12
1


 */
public class Two {

    void main() {

        for (int i = 0; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }

}
