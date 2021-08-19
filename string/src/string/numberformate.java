package string;

public class numberformate 
{
	public static void main(String[] args) 
	{
		try {
             int num = Integer.parseInt ("kalyan") ;
             System.out.println(num);
        	} 
		catch(NumberFormatException e)
			{
            System.out.println("Number format exception");
			}
	}

}
