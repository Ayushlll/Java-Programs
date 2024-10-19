// import java.util.Scanner;

// public class FactorialIterative {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();

//         long factorial = 1;
//         for (int i = 1; i <= number; i++) {
//             factorial *= i;
//         }

//         System.out.println("Factorial of " + number + " is: " + factorial);
//         scanner.close();
//     }
// }



// ************** USING RECURSION **************

import java.util.Scanner;

public class FactorialIterative {
    static int Fact(int a) {
        if (a == 0 || a == 1) {
            return 1;
        } else {
            return a * Fact(a - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: "); // Prompt for user input
        int a = sc.nextInt();
        int c = Fact(a);
        System.out.println("Factorial of " + a + " is: " + c);
    }
}
