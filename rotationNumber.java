import java.util.*;
public class rotationNumber {
    public static int countDigits(int number) {
        return (int) (Math.log10(number) + 1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        System.out.println("Enter rotating index");
        int r=sc.nextInt();
        int temp = n;
        int ln=0;
        int p;
        int a=1;
        int j;
        while(temp!=0){
            ln++;
            temp=temp/10;
        }
        r=r%ln;
        temp=0;
        for(int i=1;i<=r;i++){
            temp=temp*10;
            j=n%10;
            temp=temp+j;
            n=n/10;
        }
        p=ln-r;
        for(int i = 1;i <=p;i++){
            a = a*10;
        }
        temp=temp*a;
        temp=temp+n;
        System.out.println("After rotation");
        System.out.println(temp);
    }

}