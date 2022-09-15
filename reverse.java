import java.util.Scanner;
public class reverse
{
    public static void main(String[] args)
    {
        int rev=0,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter four digit number");
        int n=sc.nextInt();
        while(n!=0)
        {
            d=n%10;
            n=n/10;
            rev=rev*10+d;
        }
        System.out.println("Reversed number: "+rev);
    }
}