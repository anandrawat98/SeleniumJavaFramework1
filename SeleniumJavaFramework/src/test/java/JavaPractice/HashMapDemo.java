package JavaPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo 
{
public static void main(String args[])
{
	HashMap<Integer, String> hm=new HashMap<Integer, String>();
	hm.put(0, "java");
	hm.put(1, "demo");
	hm.put(2, "core");
	hm.put(3, "selenium");
	
	//System.out.println(hm.get(2));
	Set s=hm.entrySet();
	
	Iterator it= s.iterator();
	while(it.hasNext())
	{
		Map.Entry mp=(Map.Entry)it.next();
		System.out.println(mp.getKey());
		System.out.println(mp.getValue());
	
	}
	
	
}
}
