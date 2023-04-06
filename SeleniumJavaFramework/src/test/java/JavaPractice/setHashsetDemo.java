package JavaPractice;

import java.util.HashSet;
import java.util.Iterator;

public class setHashsetDemo {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
hs.add("java");
hs.add("Java");
hs.add("java");
hs.add("Java");
hs.add("tree");
hs.add("chair");

System.out.println(hs.size());
//System.out.println(hs);
System.out.println(hs.size());

 Iterator<String> i=hs.iterator();

 while(i.hasNext())
 {
	 System.out.println(i.next()); 
 }
	}

}
