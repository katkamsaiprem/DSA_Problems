package fifteenProblems;
import java.util.Scanner;
/*
take input tempatrue as celsius
if(input>40c) then convert input into fahrenheit and print fahrenheit with hot as string
else if (input<10) then convert input into fahrenheit and print fahrenheit with cold as string
else convert input into fahrenheit and print fahrenheit with normal as string
*/
public class Second {
    protected static double  celsiusToFahrenheit(double  givenCelsiusInput){

        return (givenCelsiusInput * 9.0 / 5.0) + 32.0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter temp in celsius in double");
        double givenCelsiusInput = sc.nextDouble();
        if(givenCelsiusInput>40){
            double fahrenheitValue=celsiusToFahrenheit(givenCelsiusInput);
            System.out.println("convert celsius to fahrenheit: "+ fahrenheitValue + " and it is hot ");
        }
        else if (givenCelsiusInput<10) {
            double fahrenheitValue=celsiusToFahrenheit(givenCelsiusInput);
            System.out.println("convert celsius to fahrenheit: "+ fahrenheitValue + " and it is cold");
        }
        else{
            double fahrenheitValue=celsiusToFahrenheit(givenCelsiusInput);
            System.out.println("convert celsius to fahrenheit: "+ fahrenheitValue + " and it is normal");
        }

    }
}
