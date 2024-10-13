/*import java.util.*;
import java.text.*;

public class AmazonBill {
    static void printDate(Locale locale){
        Date date = new Date();
        DateFormat dtf = DateFormat.getDateInstance(DateFormat.FULL, locale);
        System.out.println(dtf.format(date));
    }
public static void main(String[] args)
    {
    Locale locale = Locale.of("in", "IN");
    }
}
*/

import java.util.*;
import java.text.*;
public class AmazonBill {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name");
        String name=sc.nextLine();
        Locale l=new Locale("hi","IN");
        System.out.println("enter the Item purchased");
        String item=sc.nextLine();
        System.out.println("enter the Price of the "+item);
        double price=sc.nextDouble();
        System.out.println("enter the Total amount you pay");
        double amount=sc.nextDouble();
        double tax=((amount-price)/amount)*100;
        double taxamount =amount-price;
        NumberFormat nf=NumberFormat.getCurrencyInstance(l);
        System.out.print(name+"     ");
        System.out.print(item+"     ");
        System.out.print(nf.format(price)+"     ");
        System.out.print(tax+"%      ");
        System.out.print(nf.format(taxamount)+"     ");
        System.out.print(nf.format(amount)+"     ");
    }

}