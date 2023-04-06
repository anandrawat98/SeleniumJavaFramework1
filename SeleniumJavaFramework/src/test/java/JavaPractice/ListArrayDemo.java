package JavaPractice;

import java.util.ArrayList;

public class ListArrayDemo {

	public static void main(String[] args)
	{

ArrayList<String> l= new ArrayList<String>();

l.add("Anand");
l.add("Rawat");
l.add(0, "Java");
l.add("Java");
System.out.println(l.size());
System.out.println(l);
	}

}
