package fifteenProblems;

import java.util.Scanner;

/*

13. Toll Tax Billing

N vehicles pass through a toll gate. Based on vehicle type:

Car = ₹100

Bike = ₹50

Truck = ₹200


Read N entries and calculate:

Total revenue

Vehicle count by type

Highest paying vehicle category

---------------------------------------------------

 */
public class TollTax {

    void TollTaxReport(int totalRevenue, int carCount, int carRevenue, int bikeCount, int bikeRevenue, int truckCount, int truckRevenue) {
        System.out.println("Toll Tax Report");
        System.out.println("Total Revenue:- " + totalRevenue);
        System.out.println("Car Count-- " + carCount);
        System.out.println("Bike Count-- " + bikeCount);
        System.out.println("Truck Count--" + truckCount);

        if (carRevenue >= bikeRevenue && carRevenue >= truckRevenue) {
            System.out.println("Highest paying vehicle is Cars---" + carRevenue);
        } else if (bikeRevenue >= truckRevenue) {
            System.out.println("Highest paying vehicle is Bike---" + bikeRevenue);
        } else {
            System.out.println("Highest paying vehicle is Truck---" + truckRevenue);
        }
    }

    void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of vehicles");
        int n = sc.nextInt();

        int bikeCount = 0, carCount = 0, truckCount = 0;
        int bikeRevenue = 0, carRevenue = 0, truckRevenue = 0;

        for (int x = 0; x < n; x++) {
            System.out.println("Enter type of vehicle(Car/Truck/Bike)");
            String vehicle = sc.next();

            if (vehicle.equalsIgnoreCase("Car")) {
                carCount++;
                carRevenue += 100;

            } else if (vehicle.equalsIgnoreCase("Bike")) {
                bikeCount++;
                bikeRevenue += 50;
            } else if (vehicle.equalsIgnoreCase("Truck")) {
                truckCount++;
                truckRevenue += 200;
            } else {
                System.out.println("Enter correct vehicle(Car/Truck/Bike) ");
                x--;
            }

        }
        int totalRevenue = carRevenue + bikeRevenue + truckRevenue;
        
        TollTaxReport(totalRevenue, carCount, carRevenue, bikeCount, bikeRevenue, truckCount, truckRevenue);

    }
}
