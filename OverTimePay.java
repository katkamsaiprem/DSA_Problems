package problems;

import java.util.Scanner;

/*
Employee Overtime Calculator

A company pays overtime for every hour above 8 hours/day.
Given working hours for 30 days, calculate:

Total overtime hours

Total additional salary (₹150 per overtime hour)

----------------------------------------------------
totalOvertimeHours=0;
OverTimePayPerHour=150;

for loop for 30 days
  take input of each day worked hours
  if(workedhours>8) then totalOvertimeHours+=WorkedHours-8

totalOverTimePay=totalOvertimeHOurs*OverTimePayPerHour

 */
public class OverTimePay {

    public static void main(String[] args) {
        int totalOverTimeHours = 0;
        int OverTimePay = 150;
        for (int day = 1; day <=30; day++) {
            System.out.println("Enter working hours for day " + day + "");

            Scanner sc = new Scanner(System.in);
            int hoursWorked = sc.nextInt();
            if (day > 8) {
                totalOverTimeHours += (hoursWorked - 8);

            }
        }
        int totalOverTimePay=OverTimePay*totalOverTimeHours;

        System.out.println("totalOverTimePay: "+totalOverTimePay);
        System.out.println("totalOverTimeHours : "+totalOverTimeHours);

    }

}
