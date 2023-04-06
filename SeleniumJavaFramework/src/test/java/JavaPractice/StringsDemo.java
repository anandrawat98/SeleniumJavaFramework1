package JavaPractice;

public class StringsDemo {

	public static void main(String[] args) 
	{
		
		double c;
		int x;
		int y;
		int z;
		x=5;
		y=10;
		z=11;
		c=x*y+z%2;
		System.out.println(c+ " **********");

		for(int i=0;i<5;i++)
		{
			System.out.print(i);
		}
		//string literals
		String s="Anand Rawat Anu";
		String s1="Anand";
		
		
		String s2=new String("java");
		// System.out.println(s);
		//s="core";

		//System.out.println(s);
		
		for(int i=0;i<s.length();i++)
			
{
		System.out.print(s.charAt(i));
	}

		for(int j=s1.length()-1;j>=0;j--)
		{
			System.out.print(s1.charAt(j));
		}
	}

}
