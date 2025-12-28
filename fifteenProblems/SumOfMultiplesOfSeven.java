package fifteenProblems;
//7.Print the sum of all multiples of 7 between 1 and N.

public class SumOfMultiplesOfSeven {

    int MultiplesSum(int n, int sum) {
        for (int x = 0; x <= n; x += 7) {
            sum += x;

        }
        return sum;

    }

    void main() {
        int n = 12;
        int sum = 0;
        System.out.println("sum of multiples of 7 " + MultiplesSum(n, sum));
    }

}
