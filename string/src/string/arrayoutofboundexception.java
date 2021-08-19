package string;
import java.util.Scanner;
public class arrayoutofboundexception 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		Scanner f=new Scanner(System.in);
		Scanner h=new Scanner(System.in);
		try{
            int x=s.nextInt();
            int n=f.nextInt();
            int o=h.nextInt();
            int a[] = new int[x];
            a[n] = o;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("Array Index is Out Of Bounds");
        }
	}
}
