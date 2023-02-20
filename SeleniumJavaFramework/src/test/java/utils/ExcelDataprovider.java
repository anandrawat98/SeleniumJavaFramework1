package utils;

public class ExcelDataprovider {

	public static void testData()
	{
		excelutils excel=new excelutils();
		int rowCount=excel.getRowcount();
		int columnCount=excel.getColumncount();
		
		for(int i=1;i<rowCount;i++)
		{
			for(int j=0;j<columnCount;j++)
			{
				String celldata=excel.getCelldataString();
				System.out.print(celldata+" | ");
			}
			System.out.println();
		}
	}
	
	public static void main(String args[])
	{
		testData();
	}
}
