import java.util.Scanner;
public class student
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number of classes held");
        int N= sc.nextInt();
        System.out.println("Enter the number of classes attended by the student");
        int A = sc.nextInt();
        float percent = ((A*100)/N);
        System.out.println("percentage : "+percent);
        if (percent >=75)
        {
            System.out.println("Student is allowed to appear in exam");
        }
        
        if (percent<75)
        {
            System.out.println("You are on medical leave?");
            int choice=sc.nextInt();
            int yes= 1;
            int no=0 ;
            if (choice==yes)
            {
                System.out.println("Allowed to sit");
            }
            else if(choice == no)
            {
                System.out.println("Not allowed");
            }
        }
    }
}
