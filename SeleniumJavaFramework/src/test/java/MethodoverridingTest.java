
public class MethodoverridingTest
{

	public static void main(String[] args) 
	{
    TestPoly t=new TestPoly();
    t.show();
    MethodoverridingTest m= new MethodoverridingTest();
    m.show(8);
	}

	public static void show(int a)
	{
		System.out.println("Int is "+a);
	}
}
