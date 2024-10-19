// ---------- Square-----------


// import java.util.Scanner;
// public class Pattern {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the size of the square: ");
//         int size = scanner.nextInt();
//         for (int i = 0; i < size; i++) {
//             for (int j = 0; j < size; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
        
//         scanner.close();
//     }
// }


// ------------ Hollow square ------------


// import java.util.Scanner;
// public class Pattern {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the size of the square: ");
//         int size = scanner.nextInt();
//         for (int i = 0; i < size; i++) {
//             for (int j = 0; j < size; j++) {
//                 if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
//                     System.out.print("* ");
//                 } else {
//                     System.out.print("  ");  
//                 }
//             }
//             System.out.println(); 
//         }
        
//         scanner.close();
//     }
// }


// --------- (left) Right angled triangle ---------


// import java.util.Scanner;
// public class RightAngledTriangle {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the height of the triangle: ");
//         int height = scanner.nextInt();
//         for (int i = 1; i <= height; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println(); 
//         }
//         scanner.close();
//     }
// }

// ------------ Reverse right angled triangle -----------


// import java.util.Scanner;
// public class ReversedTriangle {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the height of the triangle: ");
//         int height = scanner.nextInt();
//         for (int i = height; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println(); 
//         }
//         scanner.close();
//     }
// }

// --------------- Rhombus ------------

// import java.util.Scanner;
// public class Rhombus {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the size of the rhombus: ");
//         int size = scanner.nextInt();
//         for (int i = 1; i <= size; i++) {
//             for (int j = 1; j <= size - i; j++) {
//                 System.out.print("  ");
//             }
//             for (int j = 1; j <= size; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         scanner.close();
//     }
// }


// -------------- reverse Rhombus ------------

// import java.util.Scanner;
// public class ReversedRhombus {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the size of the rhombus: ");
//         int size = scanner.nextInt();
//         for (int i = 1; i <= size; i++) {
//             for (int j = 1; j < i; j++) {
//                 System.out.print("  ");
//             }
//             for (int j = 1; j <= size; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();  
//         }
//         scanner.close();
//     }
// }

// ************* USING RECURSION ALL THE PATTERN PROGRAM *************** 


// public class RecursionDemo {

 
//     // *****
//     // *****
//     // *****
//     // *****
//     // *****


//       static void print12(int  j){
//         if(j<=0){
//           return ;
//         }
//         System.out.print("*");
//         print12(j-1);
    
//       }
    
//       static void print11(int i,int j){
//         if(i<=0){
//           return ;
//         }
//         print12(j);
//         System.out.println();
//         print11(i-1, j);
    
//       }
    
    
//      *****
//      *   *
//      *   *
//      *   *
//      *****
    
//       static void print22(int  j,int n){
//         if(j<=0){
//           return ;
//         }
//         if(j==1||j==n)
//         System.out.print("*");
//         else
//         System.out.print(" ");
//         print22(j-1,n);
    
//       }
    
//       static void print21(int i,int j,int n){
//         if(i<=0){
//           return ;
//         }
//         if(i==1 || i==n)
//         print12(j);
//         else
//         print22(j,n);
//         System.out.println();
//         print21(i-1, j,n);
    
//       }
    
    
//      *
//      **
//      ***


//       static void print31(int i,int j){
//         if(i<=0){
//           return;
//         }
//         print31(i-1, j-1);
//         System.out.println();
//         print12(j);
//       }
    
    
//        ****
//        ***
//        **
//        *

      
//       static void print41(int i,int j){
//         if(i<=0){
//           return;
//         }
//         print12(j);
//         System.out.println();
//         print41(i-1, j-1);
//       }
    
//      *****
//       *****
//        *****
//         *****
//          *****

    
//       static void print52(int  j){
//         if(j<=0){
//           return ;
//         }
//         System.out.print(" ");
//         print52(j-1);
//       }
    
//       static void print51(int i,int j,int n){
//         if(i<=0){
//           return;
//         }
//         print51(i-1, j-1,n);
//         print52(j-1);
//         print12(n);
//         System.out.println();
//       }
    
    
      
//         *****
//        *****
//       *****
//      *****
//     *****


//       static void print61(int i,int j,int n){
//         if(i<=0){
//           return;
//         }
//         print52(j-1);
//         print12(n);
//         System.out.println();
//         print61(i-1, j-1,n);
//       }
    
    
    
//       public static void main(String[] args) {
//         print11(5, 5);
//         print21(5, 5, 5);
//         print31(5, 5);
//         print41(4, 4);
//         print51(5, 5, 5);
//         print61(5, 5, 5);
//       }
//     }