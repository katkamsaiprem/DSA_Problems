package fifteenProblems;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter account balance");
        double accountBalance=sc.nextDouble();

        System.out.println("enter withdraw amount");
        double withdrawAmount=sc.nextDouble();

       
         if (withdrawAmount<=accountBalance) {
            double updatedAmount=accountBalance-withdrawAmount;
            System.out.println("updated account balance :"+ updatedAmount);
            
        }
         else{
            System.out.println("you cant withdraw  more amount");
        }
    }
    
}
