import java.util.Scanner;
public class salary
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the salary of an employee");
        float sal = sc.nextFloat();
        System.out.println("Enter the year of servive of an employee");
        float year=sc.nextFloat();
        if(year>5)
        {
            sal= sal+(sal*5/100);
            System.out.println("Your total salary after getting 5% extra bonus: "+sal);
        }
        else
        {
            System.out.println("No bonus");
        }
    }
}
