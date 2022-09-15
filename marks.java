import java.util.Scanner;
public class marks
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the marks of a student");
        float m=sc.nextFloat();
        if(m>=80)
        {
            System.out.println("Your grade: A");
        }
        else if(m<80 && m>=60)
        {
            System.out.println("Your grade: B");
        }
        else if(m<60 && m>=50)
        {
            System.out.println("Your grade: C");   
        }
        else if(m<50 && m>=45)
        {
            System.out.println("Your grade: D"); 
        }
        else if(m<45 && m>=25)
        {
            System.out.println("Your grade: E");
        }
        else if(m<25)
        {
            System.out.println("Your grade: F");
        }

    }   
}