package PartFive;

/*
4321
321
21
1

i  run j untill j<n  output
0                    1
0                    12
0    
 */
public class Three {

    void main() {

        int n = 4;
        for (int i = 0; i < n; i++) {
            int num = n - i;

            for (int j = n; j > i; j--) {
                System.out.print(num);
                num--;
            }
            System.out.println();
        }

    }

}

// Here's the dry run for the `ReverseTriangle` class:
// ## Dry Run Table
// **Initial State:** `n = 4`
// | Iteration | i | Outer Loop Condition (i < 4) | num (n - i) | j | Inner Loop Condition (j > i) | Output | num after print |
// |-----------|---|------------------------------|-------------|---|------------------------------|--------|-----------------|
// | **1st**   | 0 | ✓ (0 < 4) | 4 | 4 | ✓ (4 > 0) | 4 | 3 |
// |           |   |   |   | 3 | ✓ (3 > 0) | 3 | 2 |
// |           |   |   |   | 2 | ✓ (2 > 0) | 2 | 1 |
// |           |   |   |   | 1 | ✓ (1 > 0) | 1 | 0 |
// |           |   |   |   | 0 | ✗ (0 > 0) | `println()` | - |
// | **2nd**   | 1 | ✓ (1 < 4) | 3 | 4 | ✓ (4 > 1) | 4 | 2 |
// |           |   |   |   | 3 | ✓ (3 > 1) | 3 | 1 |
// |           |   |   |   | 2 | ✓ (2 > 1) | 2 | 0 |
// |           |   |   |   | 1 | ✗ (1 > 1) | `println()` | - |
// | **3rd**   | 2 | ✓ (2 < 4) | 2 | 4 | ✓ (4 > 2) | 4 | 1 |
// |           |   |   |   | 3 | ✓ (3 > 2) | 3 | 0 |
// |           |   |   |   | 2 | ✗ (2 > 2) | `println()` | - |
// | **4th**   | 3 | ✓ (3 < 4) | 1 | 4 | ✓ (4 > 3) | 4 | 0 |
// |           |   |   |   | 3 | ✗ (3 > 3) | `println()` | - |
// | **5th**   | 4 | ✗ (4 < 4) | - | - | - | Program ends | - |
// ## Final Output
// ```
// 4321
// 321
// 21
// 1
// ```
// ## Key Points
// - **num starts at:** `n - i` (decreasing starting number for each row)
// - **j starts at:** `n` (always 4, controls number of prints)
// - **Inner loop runs:** `n - i` times (prints `num` and decrements it)
// - Each row prints descending numbers starting from `n - i`
