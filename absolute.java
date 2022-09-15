import java.util.Scanner;
public class absolute
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if (n<0)
        {
            n=(-1) * n;
        }
        System.out.println("Absolute value : "+n);
    }
    
}
