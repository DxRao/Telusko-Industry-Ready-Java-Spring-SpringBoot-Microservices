public class LaunchApp 
{

	public static void main(String[] args) 
	{
		Amazon a=new Amazon();
		
		//FedEx ex=new FedEx();
		a.setService(new FirstFlight());//setter Injection
		
		boolean status=a.initiateDelivery(544.4);
		
		if(status)
			System.out.println("Order delivered successfully");
		else
			System.out.println("Failed to deliver");
		
	}
}
