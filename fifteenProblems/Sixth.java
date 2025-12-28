package fifteenProblems;

/*
6.Count how many numbers between 1 and N are divisible by 3 and 5.


int count=0;
int n=7;
for 1 to 7 
 if(i % 3==0 && i%5==0) then count++;
 */
public class Sixth {

    int isDivisible(int count, int n) {
        for (int x = 1; x <= n; x++) {
            if (x % 3 == 0 && x % 5 == 0) {
                count++;

            }

        }
        return count;
    }

    void main() {
        int count = 0;
        int n = 15;
        System.out.println("n :-" + n);
        System.out.println("no.of numbers divisible by 3 and 5, between 1 and N :- " + isDivisible(count, n));
    }

}
