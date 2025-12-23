package StarProblems;

/*
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
 */
public class SquarNumThree {

    public static void main(String[] args) {
        int num = 1;

        for (int row = 0; row < 4; row++) {

            for (int col = 1; col <= 4; col++) {
                System.out.print(num);
                num++;
            }

            System.out.println();
        }

    }

}
