package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class set {

	public static void main(String[] args) {
		LinkedHashSet s1=new LinkedHashSet();
		s1.add("chaitanya");
		s1.add("sagar");
		s1.add("harsha");
		s1.add("jayadhar");
		s1.add("surya");
		System.out.println("1"+s1);
		LinkedHashSet<String> s2=new LinkedHashSet<String>();
		s2.add("rambabu");
		s2.add("varma");
		s2.add("laxmi");
		s2.add("chaitanya");
		System.out.println("2"+s2);
		Iterator i=s1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		Iterator t=s2.iterator();
		while(t.hasNext()) 
		{
		System.out.println(t.next());
		}
		s1.addAll(s2);
		System.out.println("3"+s1);
		s1.remove("surya");
		System.out.println("4"+s1);
		s1.retainAll(s2);
		System.out.println("5"+s1);
		s1.removeAll(s2);
		System.out.println("6"+s1);
		int size=s2.size();
		System.out.println(size);
		s2.clear();
		System.out.println("7"+s2);
	}

}
