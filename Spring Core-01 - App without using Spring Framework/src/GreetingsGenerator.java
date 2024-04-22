import java.util.Date;

//Target Class
public class GreetingsGenerator {     
	
	private Date date;
	
	public GreetingsGenerator()
	{
		System.out.println("GreetingGenerator is instantiated");
	}
	public void setDate(Date date)
	{
		this.date=date;
	}
	
	//Business logic
	public String generateGreeting(String name)
	{
		int hour=date.getHours();//get the hour in 24 hour format
		
		if(hour<12)
		{
			return "Good Morning! "  + name;
		}
		else if(hour<16)
		{
			return "Good Afternoon! "  + name;
		}
		else if(hour<20)
		{
			return "Good Evening! "  + name;
		}
		else
		{
			return "Good Night " + name;
		}
		
	}
	@Override
	public String toString() {
		return "GreetingsGenerator [date=" + date + "]";
	}
	
	
}

