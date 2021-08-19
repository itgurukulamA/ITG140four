package string;
import java.util.Scanner;
public class user_deine_excep 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the integer");
		int c=s.nextInt();
		try
		{
		       throw new MyException(c);
		 }
		 catch(MyException e)
		{
		    System.out.println(e) ;
		}
	}
}
		class MyException extends Exception
		{
		   int a;
		   MyException(int b) 
		   {
		     a=b;
		   }
		   public String toString()
		   {
		     return ("Exception Number =  "+a) ;
	}
}
