package fifteenProblems;
import java.util.Scanner;

/*write flowcharts, pseudocode and program 

Electricity bill calculator
input - number of units

first 100 units - 5 rupees/units
next 200 units- 7 rupees/units
Remaining - 10 rupees/units
calculate total bill

---------------------
take units 
int bill=0;
if units<=100 then units*5
else if units>100 && units<=200 then bill = ((100*5)+(units-100)*7)
else
    bill=((100*5)+(200*7)+(units-300)*10)

*/
public class One {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.of units");
        int givenUnits=sc.nextInt();
        
        int bill=0;
        if(givenUnits<=100){
         bill=givenUnits*5;
         

        }
        else if (givenUnits>100 && givenUnits<=300) {
            bill=((100*5)+(givenUnits-100)*7);
            
            
        }
        else{
            bill=((100*5)+(200*7)+(givenUnits-300)*10);
            
        }
        System.out.println("bill :"+bill);
        
    }
    
}
