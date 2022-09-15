import java.util.Scanner;
public class employee
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter employee's age");
        int age=sc.nextInt();
        System.out.println("Enter employee's gender");
        String gen = sc.nextLine();
        int choice=sc.nextInt();
        int female =1;
        int male =0;
        System.out.println("Enter marital status");
        String mar=sc.next();

        if(choice == female)
        {
            System.out.println("She will work in urban areas");
        }

        else if(choice==male && age>=20 && age <=40)
        {
            System.out.println("He may work anywhere");
        }
        else if(choice==male && age>40 && age<=60)
        {
            System.out.println("He will work in urban ares only");
        }
        else 
        {
            System.out.println("ERROR");
        }


    }
}