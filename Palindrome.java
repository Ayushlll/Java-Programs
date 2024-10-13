/*public class Palindrome {
    public Palindrome() {
    }
    public static void main(String[] var0) {
       String var1 = "racecar";
       String var2 = "";
       for(int var3 = 0; var3 < var1.length(); ++var3) {
          var2 = var2 + var1.charAt(var3);
       }
       if (var1.equals(var2)) {
          System.out.println("yes, it is palindrome");
       }
    }
 }
*/

class Solution {
   public boolean isPalindrome(int x) {
       if(x<0){
           return false;
       }
       int dup=x;
       int rev=0;
       while(x>0){
           int dig=x%10;
           rev=rev*10+dig;
           x=x/10;
       }
       if(dup==rev){
           return true;
       }
       return false;
   }
}
 