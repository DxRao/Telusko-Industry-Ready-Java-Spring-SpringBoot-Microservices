
public class LaunchApp 
{

	public static void main(String[] args) 
	{
		GreetingsGenerator greet=new GreetingsGenerator();
		System.out.println("Target Object before injecting Dependent Object => "+ greet);
		
		java.util.Date date=new java.util.Date();
		System.out.println("Dependent Obj =>"+ date);
		
		greet.setDate(date);//Setter Injection
		
		
		System.out.println("Target Object After injecting Dependent Object => "+ greet);
			
		String message=greet.generateGreeting("Rao");
		System.out.println(message);
	}

}
