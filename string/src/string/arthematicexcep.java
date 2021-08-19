package string;
import java.util.Scanner;
public class arthematicexcep 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		Scanner o=new Scanner(System.in);
		try {
            int a=s.nextInt();
            int b=o.nextInt();
            int c = a/b;
            System.out.println ("Result = " + c);
        }
        catch(ArithmeticException e) {
            System.out.println ("Can't divide a number by 0");
        }
	}
}
