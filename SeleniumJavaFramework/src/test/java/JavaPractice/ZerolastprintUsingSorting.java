package JavaPractice;

import java.util.Arrays;

public class ZerolastprintUsingSorting {

	public static void main(String[] args)
	{
		int a[]= {4,5,6,0,5,0,9,0,3};
		int n;
		n=a.length;
		sortinguse(n,a);
		
	}
	
	public static void sortinguse(int n,int a[])
	{
		
		Arrays.sort(a); // It will the result with ascending order
		
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(" "+a[i]); // printing the array in descending order
		}
		
	}

}
