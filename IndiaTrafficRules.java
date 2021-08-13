package InterfaceExamples;

public class IndiaTrafficRules implements CentralTrafficRules{

	public static void main(String[] args) {
		CentralTrafficRules ct=new IndiaTrafficRules(); // here we have created object of CentralTrafficRules class to implement methods from IndiaTrafficRules class. 
		ct.goGreen();
		ct.stopRed();
		ct.waitYellow();
		IndiaTrafficRules it=new IndiaTrafficRules(); // here it variable refers to IndiaTrafficRules object and will have access of only IndiaTrafficRules methods.
		it.applyBreaks();
	

	}

	@Override
	public void goGreen() {
		System.out.println("Move your vehicle");
		
	}

	@Override
	public void stopRed() {
		System.out.println("Stop your vehicle");
	}

	@Override
	public void waitYellow() {
		System.out.println("Wait till light turns green");
		
	}
	
	public void applyBreaks()
	{
		System.out.println("Apply Breaks when light turns red");
	}

}
