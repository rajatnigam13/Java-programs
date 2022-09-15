import java.util.Scanner;
public class shop
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the purchased quantity");
        int quan=sc.nextInt();
        if(quan>1000)
        {
            quan= quan-(quan*10/100);
            System.out.println("Total price after getting 10% discount: "+quan);
        
        }
        else
        {
            System.out.println("no discount");
        }

    }
}

