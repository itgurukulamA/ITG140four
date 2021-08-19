package string;

import java.util.*;
public class RemoveCommonCharacters {
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter String1 ");
		String s1=obj.next();
		System.out.println("Enter String2");
		String s2=obj.next();
		String common="";
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					common=common+s1.charAt(i);
				}
				
			}
		}
		System.out.println(common);
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<common.length();j++)
			{
				if(s1.charAt(i)==common.charAt(j))
				{
					String s3=Character.toString(s1.charAt(i));
					s1=s1.replaceAll(s3,"");
					
				}
			}
		}
		System.out.println("");
		for(int i=0;i<s2.length();i++)
		{
			for(int j=0;j<common.length();j++)
			{
				if(s2.charAt(i)==common.charAt(j))
				{
					String s3=Character.toString(s2.charAt(i));
					s2=s2.replaceAll(s3,"");
				}
			}
		}
		System.out.println(s1+"\n"+s2);
		
	}
}
