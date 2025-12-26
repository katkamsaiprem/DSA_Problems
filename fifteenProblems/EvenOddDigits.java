package fifteenProblems;

/*
2.Count how many even and odd digits are present in a number.

while n>0
 l=get last digit using %
  l%2==0 then even countEven++ else countOdd++
  n/=10 ,/ to remove last digit 
 */
public class EvenOddDigits {

    void CheckEvenOdd(int countEven, int countOdd, int n) {
        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit % 2 == 0) {
                countEven++;

            } else {
                countOdd++;
            }
            n /= 10;

        }
    }

    void main() {
        int n = 223;
        System.out.println("give num " + n);
        int countEven = 0;
        int countOdd = 0;
        CheckEvenOdd(countEven, countOdd, n);

        System.out.println("even " + countEven);
        System.out.println("odd " + countOdd);

    }

}
