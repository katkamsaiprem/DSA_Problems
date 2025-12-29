package fifteenProblems;

import java.util.Scanner;

/*
15. Library Fine System

For N books returned:
Input delay days.
Fine:

First 5 days = ₹2/day

Next 5 days = ₹4/day

After 10 days = ₹6/day


Calculate total fine.
--------------------------------------------

 */
public class LibraryFineSystem {

    int calculate(int delayDays) {
        int fine = 0;
        if (delayDays <= 0) {
            return 0;
        }
        if (delayDays <= 5) {
            fine = delayDays * 2;
        } else if (delayDays <= 10) {
            fine = (5 * 2) + ((delayDays - 5) * 4);
        } else {
            fine = (5 * 2) + (5 * 4) + ((delayDays - 10) * 6);
        }
        return fine;

    }

    void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no.of books");
        int n = sc.nextInt();

        int totalFine = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter delay days for book " + i + ": ");
            int delayDays = sc.nextInt();
            int fine = calculate(delayDays);
            totalFine += fine;
            System.out.println("Fine for book " + i + ": " + fine);

        }
        System.out.println(" Total fine for all books: " + totalFine);

    }
}
