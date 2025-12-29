package fifteenProblems;

/*
14.Traffic Signal Timer Simulation

Simulate traffic light for 50 seconds using loop:

Red = 20 sec

Yellow = 5 sec

Green = 25 sec
Print the color displayed every second.
---------------------------------------------------------------


 */
public class TrafficSignal {

    void TrafficSignalStart(int totalTime) {
        for (int second = 1; second < totalTime; second++) {
            if (totalTime <= 20) {
                System.out.println("second " + second + " Red");
            } else if (totalTime <= 25) {
                System.out.println("Second " + second + " Yellow");
            } else {
                System.out.println("Second " + second + " Yellow");
            }

        }
    }

    void main() {
        int totalTime = 50;
        TrafficSignalStart(totalTime);

    }

}
