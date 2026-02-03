package PartFive;

/*
ABCD
ABC
AB
A



 */
public class four {

    void main() {
        for (int i = 0; i < 4; i++) {
            char ch = 'A';
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(ch++);

            }
            System.out.println();
        }
    }
}
