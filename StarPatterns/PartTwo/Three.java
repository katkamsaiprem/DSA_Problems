package StarPatterns.PartTwo;

public class Three {

    void main() {
        int counter = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(counter++ + " ");// post increament increases the value after current statement executes not after the iteration completes
            }
            System.out.println();
        }
    }

}
//The post-increment operator `counter++` increments the value **after the current statement executes**, not after the iteration completes.

// Here's what happens:
// ```java
// System.out.print(counter++);
// ```
// 1. The **current value** of `counter` is used in the `print` statement
// 2. **Immediately after** the print statement executes, `counter` is incremented
// So in your code:
// - First iteration: prints `1`, then counter becomes `2`
// - Second iteration: prints `2`, then counter becomes `3`
// - Third iteration: prints `3`, then counter becomes `4`
// - And so on...
// **Your comment is slightly incorrect**. It should be:
// ````java
// // ...existing code...
// System.out.print(counter++); // post-increment uses current value, then increments after this statement
// // ...existing code...
// ````

// If you used `++counter` (pre-increment), it would increment **before** using the value in the print statement.
