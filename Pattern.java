// ---------- Square-----------


import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the square: ");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}


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