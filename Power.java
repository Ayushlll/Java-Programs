// import java.util.*;
// public class Power {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter base number");
//         int base = sc.nextInt();
//         System.out.println("enter exponent num");
//         int exp = sc.nextInt();
//         long  ans=1;
//         for (int i = 0; i < exp; i++) {
//             ans= ans*base;
//         }
//         System.out.println(ans);
//     }
// }


// POWER OF THREE 
class Power {
    public boolean isPowerOfThree(int n) {
        long temp=1;
       int i=1;
       while(n>1 && temp<n)
       {
           temp+=temp<<1;
       }
       return temp==n;
    }
}