import java.util.*;

public class keith_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=n;
        int d=count(n);        
        if(n<100)
        {
            System.out.println("Invalid Number");
        }
        else{
            int arr[]=new int[d];
            for(int i=0;n>0;i++)
            {
                arr[i]=n%10;
                n/=10;
            }
            int sum=0;
            while(sum<=num)
            {
                sum=sumofarr(arr);
                if(sum==num)
                {
                    System.out.println("true");
                    break;
                }
                else if(sum>num)
                {
                    System.out.println("false");
                    break;
                }
                else
                {
                    for(int j=arr.length-1;j>0;j--)
                    {
                        arr[j]=arr[j-1];
                    }
                    arr[0]=sum;


                }
            }
        }
    }
    public static int sumofarr(int arr[])
    {
        int sum=0;
        for(int i:arr)
         sum+=i;
         return sum;
    }
    public static int count(int n)
    {
        int d=0;
        while(n>0)
        {
            n/=10;
            d++;
        }
        return d;
    }
    
}