package fifteenProblems;

import java.util.Scanner;



/*
take item price 
take items quantity
total = price*quantity
if total>500 then 20% discount
else
    no discount
print final amount after discount

*/

public class three {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter item price");
    double itemPrice=sc.nextDouble();
    System.out.println("enter no.of items");
    double itemsQuantity=sc.nextDouble();
    double finalPrice;

    double total=itemPrice*itemsQuantity;
    if(total>5000){
        double discountAmount= total *(20.0/100.0);
         finalPrice = total - discountAmount;
         System.out.println(finalPrice);
    }
    else{
        System.out.println("no discount");
        System.out.println(total);
    }
 }    
}
