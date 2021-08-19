package collections;
import java.util.*;
public class list 
{
	public static void main(String[] args) 
	{
		List<String> l1=new ArrayList<String>();
		l1.add("chaitanya");
		l1.add("sagar");
		l1.add("harsha");
		l1.add("jayadhar");
		l1.add("surya");
		System.out.println("1"+l1);
		List<String> l2=new ArrayList<String>();
		l2.add("rambabu");
		l2.add("varma");
		l2.add("laxmi");
		l2.add("chaitanya");
		System.out.println("2"+l2);
		Iterator i=l1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		Iterator t=l2.iterator();
		while(t.hasNext()) 
		{
		System.out.println(t.next());
		}
		l1.addAll(l2);
		System.out.println("5"+l1);
		l1.remove("surya");
		System.out.println("6"+l1);
		l1.retainAll(l2);
		System.out.println("7"+l1);
		l1.removeAll(l2);
		System.out.println("8"+l1);
		l2.get(1);
		System.out.println("9"+l2);
		int size=l2.size();
		System.out.println(size);
		l2.clear();
		System.out.println("9"+l2);
	}
}
