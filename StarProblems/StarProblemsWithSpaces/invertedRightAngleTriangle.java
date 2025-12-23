package StarProblems.StarProblemsWithSpaces;

/*
****
***
**
*

 */
public class invertedRightAngleTriangle {
//  public static void main(String[] args) {
//     int n=4;
//     for(int i=0;i<n;i++){
//         for(int j=n;j>i;j--){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
//  }
// 
//-----------------------------------
/*
1234
123
12
1
     */

    // public static void main(String[] args) {
    //     int n = 4;
    //     for (int i = 0; n > i; i++) {
    //         int num = 1;//value resets for every iteration
    //         for (int j = n; j > i; j--) {
    //             System.out.print(num);
    //             num++;
    //         }
    //         System.out.println();
    //     }
    // }

    /*
    4321
    321
    21
    1
    
     */
    // public static void main(String[] args) {
    //     int n = 4;
    //     for (int i = 0; i < n; i++) {
    //         int num=4-i;//for every row ,decease by one
    //         for(int j=n;j>i;j--){
    //             System.out.print(num);
    //             num--;
    //         }
    //         System.out.println();
    //     }
    // }

    /*
    
ABCD
ABC
AB
A
     

     */
    // public static void main(String[] args) {
    //     int n = 4;
    //     for (int i = 0; n > i; i++) {
    //         char ch = 'A';
    //         for (int j = n; j > i; j--) {
    //             System.out.print(ch);
    //             ch++;
    //         }
    //         System.out.println();
    //     }
    // }

    /*
****
 ***
  **
   *
    
     */
    // public static void main(String[] args) {
    //     int n = 4;
    //     for (int i = 0; n > i; i++) {
    //         for (int j = 0; n > j; j++) {
    //             if (j < i)//for every ,row check this 
    //             {
    //                 System.out.print(" ");
    //             } else {
    //                 System.out.print("*");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
    //---with post decreament---
//     public static void main(String[] args){
//         int n=4;
//         for(int i=0;i<n;i++){
//             for(int j=n;j>0;j--){
//                 if(j>n-i){
//                     System.out.print(" ");
//             }
//             else{
//                 System.out.print("*");
//             }
//         }
//         System.out.println();    
//     }
// }
/*
1234
 234
  34
   4
     */
//     public static void main(String[] args) {
//         int n = 4;
//         for (int i = 0; i < n; i++) {
//             int num = 1;
//             for (int j = 0; j < n; j++) {
//                 if (j < i) {
//                     System.out.print(" ");
//                 } else {
//                     System.out.print(num);
//                 }
//                 num++;
//             }
//             System.out.println();
//         }
//     }
//     //--without num variable--------------
//      public static void main(String[] args){
//         int n=4;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 if(j<i){
//                     System.out.print(" ");
//             }
//             else{
//                 System.out.print(j+1);
//             }
//         }
//         System.out.println();    
//     }
// }
/*

ABCD
 ABC
  AB
   A

     */
    // public static void main(String[] args) {
    //     int n = 4;
    //     for (int i = 0; n > i; i++) {
    //         char ch = 'A';
    //         for (int j = 0; j < n; j++) {
    //             if (j < i) {
    //                 System.out.print(" ");
    //             } else {
    //                 System.out.print(ch);
    //                 ch++;
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
/*

ABCD
 BCD
  CD
   D
     */
    // public static void main(String[] args) {
    //     int n = 4;
    //     for (int i = 0; i < n; i++) {
    //         char ch = 'A';
    //         for (int j = 0; j < n; j++) {
    //             if (j < i) {
    //                 System.out.print(" ");
    //             } else {
    //                 System.out.print(ch);
    //             }
    //             ch++;
    //         }
    //         System.out.println();
    //     }
    // }
    /*
   *   // 3s 1ch
  ***  // 2s 3ch
 ***** // 1s 5ch
******* //0s 7ch


    //  */
    // public static void main(String[] args) {
    //     int n = 4;
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < n + i; j++) {
    //             if (j < n - i - 1) {
    //                 System.out.print(" ");
    //             } else {
    //                 System.out.print("*");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
}
