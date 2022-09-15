
public class expressions
{
    public static void main(String[] args)
    {
        int x=2, y= 5 , z=0;
        if (x==2 && x!=5)
        {
            System.out.println("OK");
        }
        if(x != 5 && y >= 5)
        {
            System.out.println("GOOD");
        }
        if(z != 0 || x == 2)
        {
            System.out.println("NICE");
        }
        if(!(y < 10))
        {
            System.out.println("HMM");
        }
        else
        {
            System.out.println(" SHUT UP");
        }
    }
    
}
