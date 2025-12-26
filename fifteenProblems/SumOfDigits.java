package fifteenProblems;

/*
1.Find the sum of digits of a given number.
int num 
while num>0
 sum+=num%10
 num/10
 sout sum
 */
public class SumOfDigits {

    void SumOfDigitss(int num, int sum) {
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }

    void main() {
        int num = 3333;
        int sum = 0;
        SumOfDigitss(num, sum);

    }

}
