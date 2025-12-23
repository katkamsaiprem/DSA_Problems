package fifteenProblems;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number to get Multiplication Table");
        int n=sc.nextInt();

        for(int z=0;z<=10;z++){
            System.out.println(n+""+"*"+""+z+""+"="+n*z);
        }

    }
    
}
