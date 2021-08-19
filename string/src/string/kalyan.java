package string;
import java.util.Scanner;
public class kalyan 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		Scanner c=new Scanner(System.in);
		System.out.println("enter how many words for string 1 you have to enter");
		String[] st1 = new String [s.nextInt()];
		System.out.println("enter how many words for string2 you have to enter");
		String[] st2=new String [c.nextInt()];
		String common="";
		for(int i = 0; i < st1.length; i++)   
		{  
		for(int j=0;j<st2.length;j++)
		{
			if(st1[i]==st2[j])
			{
				common=common+st1[i];
			}
			System.out.println(common);
		}
		}
	}
}
