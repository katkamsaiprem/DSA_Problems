package fifteenProblems;


import java.util.Scanner;

/*
// Generate the first N Fibonacci numbers using a loop.

Fibonacci means sequence in which each element is sum of two previous and current values
0 1 1 2 3 5 8 13

0 and 1 should be default values ,next value should be sum of 0 and 1 like  0+1 = 1 

------------
n=Input , first =0 and second=1

n is no.of iterations

use for loop upto i<n
sop(prev +"")
next=prev+curr
prev=curr
curr=next

 */
public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter n:");
        int n = sc.nextInt();
        int prev = 0, curr = 1;

        System.out.print("Fibonacci seq  ");

        for (int i = 0; i < n; i++) {
            System.out.print(prev+"");
            int next=prev+curr;
            prev=curr;
            curr=next;
        }

    }
}
