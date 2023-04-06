package JavaPractice;

public class nestedLoopDemo {

	public static void main(String[] args)
	{
		int k=3;
	/*	for(int i=0;i<=4;i++)
		{
			//System.out.println("start inner");
			
			for(int j=1;j<4-i;j++)
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}
		*/
		int p=1;
		for(int i=1;i<4;i++)
		{
			//System.out.println("start inner");
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(k*p);
				System.out.print("\t");
				//k++;
				p++;
			}
			System.out.println("");
		}

		/* 
		 * 3
		 * 6 9
		 * 12 15 18
		 */
	}

}
