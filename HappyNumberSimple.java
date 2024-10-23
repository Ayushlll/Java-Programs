import java.util.Scanner;

public class HappyNumberSimple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean res=false;
        if(n==1)
        {
            System.out.println("true");
        }
        else
        {
            while(n!=1)
            {
                n=power(n);
                System.out.println(n);
                if(n==1)
                res=true;
            }
            System.out.println(res);
        }
    }
    public static int power(int n)
    {
        int num=0;
        while(n>0)
        {
            num=num+((n%10)*(n%10));
            n/=10;
        }
        return num;
    }
    
}