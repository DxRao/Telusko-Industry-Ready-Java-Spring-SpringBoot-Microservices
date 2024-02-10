import java.util.Scanner;

class UnderAgeException extends Exception
{
	public UnderAgeException(String msg)
	{
		super(msg);
	}
}
class OverAgeException extends Exception
{
	public OverAgeException(String msg)
	{
		super(msg);
	}
}
class Applicant
{
	int age;
	
	public void input()
	{
		System.out.println("Welcome to RTO License Application");
		Scanner scan=new Scanner(System.in);
		System.out.println("Kindly enter the Age ");
		age=scan.nextInt();
	}
	public void verify() throws UnderAgeException, OverAgeException
	{
		if(age<18)
		{
			UnderAgeException uae=new UnderAgeException("Please Wait! your time will come after few more years");
		    System.out.println(uae.getMessage());
		   throw uae;
		}
		else if(age>90)
		{
			OverAgeException oae=new OverAgeException("Uncle! Your time is near, be carefull, Rest at home");
		    System.out.println(oae.getMessage());
		   throw oae;
		}
		else
		{
			System.out.println("You can proceed with application, You're Eligible");
		}
	}
}
class RTO
{
	public void initiate()
	{
		Applicant app=new Applicant();
		
		
		try 
		{
			app.input();
			app.verify();
		} 
		catch (UnderAgeException | OverAgeException e) 
		{
			try 
			{
				app.input();
				app.verify();
			} 
			catch (UnderAgeException | OverAgeException e1) 
			{
				try 
				{
					app.input();
					app.verify();
				} 
				catch (UnderAgeException | OverAgeException e2) 
				{
					System.out.println("You're ineligible to apply and blocked from applying again");
					
				}
				
			}
			
		}
	}
}

public class RTOcustomExceptionHandling {

	public static void main(String[] args) {
		
		RTO rto=new RTO();
		rto.initiate();

	}

}

