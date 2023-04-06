package JavaPractice;

public class mutidimesionlaAarryDemo {

	public static void main(String[] args)
	{
int a[][]=new int[2][3];
a[0][0]=1;
a[0][1]=2;


int b[][]= {{1,2,3},{4,5,6}};
int max=b[0][0];
for(int i=0;i<2;i++)
{
	for(int j=0;j<3;j++)
	{
		
		//System.out.print(b[i][j]);
		//System.out.print("\t");
		if(b[i][j]>max)
		{
			max=b[i][j];
		}
	}
	System.out.println("");
	
}
System.out.println("max value in array: "+max);
}

}
