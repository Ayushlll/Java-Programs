import java.util.Scanner;
public class Armstrong {
    static boolean Armstrong(int number){
        boolean isArmNumber=false;
        int sum=0;
        int tempNum= number;
        while(tempNum>0){
            int r   =tempNum%10;
            sum     =sum+(r*r*r);
            tempNum =tempNum/10;
        }
        if(sum==number){
            isArmNumber =true; 
        }
        return isArmNumber;
    }
    public static void main(String[] arg){
        Scanner sc  =   new Scanner(System.in);
        System.out.println("Enter Number  : ");
        int num =   sc.nextInt();
        if(Armstrong(num)){
            System.out.println(num+" is an ArmStrong Number");
        }
        else{
            System.out.println(num+" is not an ArmStrong Number");
        }
    }
}