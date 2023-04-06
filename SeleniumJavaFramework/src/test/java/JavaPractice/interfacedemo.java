package JavaPractice;

public class interfacedemo implements centraltraffic, interfacedemoTwo {

	public static void main(String args[])
	{
		centraltraffic i= new interfacedemo();
		i.redStop();
		i.yellowWait();
		i.goGreen();
		interfacedemo j= new interfacedemo();
		j.indicator();
		interfacedemoTwo k= new interfacedemo();
		k.dontTalk();
	}

	public  void redStop() {

		System.out.println("Red please stop");

	}

	public void yellowWait() {
		System.out.println("Yellow please wait");

	}

	public void goGreen() {
		System.out.println("Green Lets go");

	}
	
	public void indicator() {
		System.out.println("hand indicate to go");

	}

	public void dontTalk() {
		System.out.println("Dont talk while driveing");
	}





}

