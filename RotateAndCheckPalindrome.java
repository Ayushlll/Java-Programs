import java.util.Scanner;
public class RotateAndCheckPalindrome {
    public static int rotateNumber(int num) {
        String str = String.valueOf(num);
        String rotatedStr = str.substring(1) + str.charAt(0); 
        rotatedStr = rotatedStr.substring(1) + rotatedStr.charAt(0); 
        return Integer.parseInt(rotatedStr);
    }
    public static boolean isPalindrome(int num) {
        String str = String.valueOf(num);
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int rotatedNum = rotateNumber(num);
        System.out.println("Number after two rotations: " + rotatedNum);
        
        if (isPalindrome(rotatedNum)) {
            System.out.println(rotatedNum + " is a palindrome.");
        } else {
            System.out.println(rotatedNum + " is not a palindrome.");
        }
        scanner.close();
    }
}
