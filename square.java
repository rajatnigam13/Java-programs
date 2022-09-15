import java.util.Scanner;
public class square
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of a rectange");
        int l=sc.nextInt();
        System.out.println("Enter the breadth of a rectangle");
        int b=sc.nextInt();
        if (l==b)
        {
            System.out.println("It is a Square");
        }
        else 
        {
            System.out.println("It is not a square");
        }
    }
}
