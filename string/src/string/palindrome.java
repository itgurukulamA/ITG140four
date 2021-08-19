package string;
import java.util.Scanner;
public class palindrome 
{
	public static void main(String[] args)
	{   
		String st,rev="";
		Scanner s=new Scanner(System.in);
		System.out.println("enter any name ");
		st=s.next();
		int length=st.length();
		for (int i=st.length() -1;i>=0;i--)
		{
			rev=rev+st.charAt(i);
		}	
			System.out.println(rev);
		if(st.equals(rev))
		{
			System.out.println("given name is a palindrome");
		}else
		{
			System.out.println("given name is not a palindrome");
		}
        
}
}
