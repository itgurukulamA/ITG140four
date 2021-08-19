package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class map 
{
	public static void main(String[] args) 
	{
		Map m1=new HashMap();
		m1.put(1,"king");
		m1.put(2,"queen");
		m1.put(3,"knight");
		m1.put(4,"horse");
		m1.put(5,"elephant");
		System.out.println("1"+m1);
		Map m2=new HashMap();
		m2.put(1,"king");
		m2.put(2,"bgmi");
		m2.put(3,"pubg");
		m2.put(4,"sudoko");
		m2.put(5,"snakes");
		m2.put(6,"ludo");
		System.out.println("2"+m2);
		Iterator i= m1.keySet().iterator();
		while(i.hasNext())  
		{  
		int key=(int)i.next();  
		System.out.println("3"+m1.get(key));
		}
		Iterator t= m2.keySet().iterator();
		while(t.hasNext())  
		{  
		int k=(int)t.next();  
		System.out.println("4"+m2.get(k));
		}
		m1.putAll(m2);
		System.out.println("5"+m1);
		System.out.println("6"+m2);
		m1.putAll(m2);
		System.out.println("7"+m1);
		System.out.println("8"+m2);
		m1.remove("king");
		System.out.println("9"+m1);
		m1.remove(m2);
		System.out.println("10"+m1);
		m2.get(1);
		System.out.println("11"+m2);
		int size=m2.size();
		System.out.println(size);
		m2.clear();
		System.out.println("12"+m2);
	}
}
