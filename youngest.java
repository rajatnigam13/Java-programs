import java.util.Scanner;
public class youngest
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of 1st person");
        int a=sc.nextInt();
        System.out.println("Enter the age of 2nd person");
        int b= sc.nextInt();
        System.out.println("Enter the age of 3rd person");
        int c= sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println("1st person is oldest among them");
        }
        else if(b>a && b>c)
        {
            System.out.println("2nd person is oldest among them");
        }
        else if(c>a && c>b)
        {
            System.out.println("3rd person is oldest among them");
        }
        
        if(a<b && a<c)
        {
            System.out.println("1st person is youngest among them");
        }
        else if(b<a && b<c)
        {
            System.out.println("2nd person is youngest among them");
        }
        else if(c<a && c<b)
        {
            System.out.println("3rd person is youngest among them");
        }
        
    }
    
}
