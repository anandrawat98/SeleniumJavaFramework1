package JavaPractice;

import net.bytebuddy.description.modifier.SynchronizationState;

public class forloopdemo {

	public static void main(String[] args)
	{
		int a[]= new int[6];
		a[0]=1;
		a[1]=2;
		a[2]=7;

		int b[]= {1,2,3,4,5,6};
		//	for(int i=0;i<b.length;i++)
		//	{
		//		System.out.println(b[i]);
		//	}
		for(int c :b)
		{
			System.out.println(c);
		}

		String []name= {"Anand","Rawat","4185","vam","a"};
		for(String dis :name)
		{
			System.out.println(dis);
		}
		
		int[] num= {1,11,13,2,6,8,41,420,5};
		for(int j :num)
		{
			if(j%2==0)
			{
				System.out.println("EVEN"+j);
			}
			else
			{
				System.out.println("number is odd"+j);
			}
		}
	}

}
