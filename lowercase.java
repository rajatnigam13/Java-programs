import java.util.Scanner;
public class lowercase
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character you want to check");
        char alpha = sc.next().charAt(0);
        if ( alpha >= 'a' && alpha <= 'z' )
        {
            System.out.println("Lowercase alphabets");
        } 
        else if(alpha >= 'A' && alpha <= 'Z')
        {
            System.out.println("Uppercase alphabets");
        }
    }
    
}
