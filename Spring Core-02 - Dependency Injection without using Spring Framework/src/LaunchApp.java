public class LaunchApp 
{

	public static void main(String[] args) 
	{
		Amazon a=new Amazon();
		
		//FedEx ex = new FedEx();
		//BlueDart bd = new BlueDart();
		//FirstFlight ff = new FirstFlight();
		
		//a.setService(new FedEx()); //setter Injection
		//a.setService(new BlueDart()); //setter Injection
		
		a.setService(new FirstFlight()); //setter Injection
		
		boolean status=a.initiateDelivery(544.4);
		
		if(status) // if(status == true)
			
			System.out.println("Order delivered successfully");
		else
			
			System.out.println("Failed to deliver");		
	}
}
