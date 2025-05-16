import java.util.*;
import java.io.*;
class nameException extends RuntimeException
{
    nameException(String s)
    {
        super(s);
    }
}

public class usepss 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter usernme: ");
        String user=sc.next();
        System.out.println("Enter password: ");
        String pass=sc.next();
        try
        {
            if(user.length()==1 || pass.length()< 8)
            {
                String c = "Invalid username or password";
                throw new nameException(c);
            } 
        }
        catch( nameException e)
        {
            System.out.println(e.getMessage());
            System.exit(0);

        }   
    }
    
}
