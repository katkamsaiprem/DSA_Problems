package fifteenProblems;

/*
3.Find the largest digit in a given number

    n= 1231

    largest =0
    lastdigit=n%10 // % to get remainder
                                        
    if lastdigit > largest then largest = lastdigit 

    n/=10  //  "/" to remove last digit
 */
public class LargestDigit {

    void largestDigitOfNum(int largestDigit, int n) {
        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit > largestDigit) {
                largestDigit = lastDigit;
            }
            n /= 10;
        }
        System.out.println("largestDigit in given num " + largestDigit);
    }

    void main() {

        int n = 237424;
        System.out.println("given num " + n);

        int largestDigit = 0;
        largestDigitOfNum(largestDigit, n);

    }

}
