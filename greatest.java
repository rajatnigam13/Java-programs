import java .util.Scanner;

public class greatest 
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the 1st value");
    int a= sc.nextInt();
    System.out.println("Enter the 2nd value");
    int b=sc.nextInt();
    if(a>b)
    {
        System.out.println("Greatest among them");
    }
    else 
    {
        System.out.println("Not a greater number");
    }

    }
    

}
    

