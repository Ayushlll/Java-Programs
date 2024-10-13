import java.util.Scanner;

public class AlphabetRangoli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i < n; i++) {
            printLine(n, i);
        }
        for (int i = n - 2; i >= 0; i--) {
            printLine(n, i);
        }
    }

    public static void printLine(int n, int i) {
        StringBuilder line = new StringBuilder();

        for (int j = 0; j <= i; j++) {
            line.append((char) ('a' + (n - j - 1)));
            if (j < i) line.append(" ");
        }
        for (int j = i - 1; j >= 0; j--) {
            line.append(" ");
            line.append((char) ('a' + (n - j - 1)));
        }

        System.out.printf("%" + (n + i) + "s%n", line);
    }
}