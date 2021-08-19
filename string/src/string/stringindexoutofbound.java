package string;
import java.util.Scanner;
public class stringindexoutofbound 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a statement");
		try 
		{
			String a;
			a=s.nextLine();
			char c = a.charAt(24); 
			System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException e) 
		{
			System.out.println("StringIndexOutOfBoundsException");
		}
	}
}
