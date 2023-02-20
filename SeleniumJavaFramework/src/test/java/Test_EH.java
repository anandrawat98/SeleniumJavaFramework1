import org.apache.commons.collections.bag.SynchronizedSortedBag;

public class Test_EH {

	public static void main(String[] args) 
	{
		EH();
		try {
			E();
		} catch (Exception e) {
			e.printStackTrace();
		}
      
    }
public static void EH()
	{
		try
		{
			int i=1/0;
			System.out.println("In Try Now");
			
		}
		catch(Exception exp)
		{
			System.out.println("In catch");
			System.out.println("Message is :"+exp.getMessage());
			System.out.println("Cause is :"+exp.getCause()+" Localized message is "+exp.getLocalizedMessage());
			exp.getStackTrace();
		}
			finally
			{
				System.out.println("wow, it is fianlly block");
				
			}
		
	} 
	
	public static void E() throws Exception
	{
		int j=1/0;
		System.out.println("J is"+j);
	}
}

