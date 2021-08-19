package string;
import java.util.Scanner;
public class reversestring 
{
	public static void main(String[] args) 
	{
		String st;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		st=s.nextLine();
		String str2=new String();
		String str1[]=st.split(" ");
		for(int i=0;i<str1.length;i++)
		{
			String s1=str1[i];
			int length=s1.length();
			for(int j=length-1;j>=0;j--)
			{
				System.out.print(s1.charAt(j));
			}
			System.out.print("");
		}
	}
}
