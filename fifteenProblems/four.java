package fifteenProblems;

import java.util.Scanner;

/*

*/
public class four {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter height");
    double height=sc.nextDouble();
    System.out.println("enter weight");
    double weight=sc.nextDouble();
    double userBMI=weight/height*height;

    if(userBMI<18.5){
        System.out.println("under weight");

    }
    else if(userBMI<25){
        System.out.println("Normal ");
    }
    else if(userBMI<30){
        System.out.println("Over weight");
    }
    else{
        System.out.println("Obese");
    }
}    
}
