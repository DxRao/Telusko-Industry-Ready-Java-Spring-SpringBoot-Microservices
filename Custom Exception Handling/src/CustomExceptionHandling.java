import java.util.Scanner;

class InvalidCustomerException extends Exception
{
	public InvalidCustomerException(String msg)
	{
		super(msg);
	}
	
}
class ATM
{
	private int acc=1212;
	private int pwd=1111;
	
	int acNo;
	int password;
	
	public void input()
	{
		System.out.println("Welcome to Telusko Bank");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Account number");
		acNo=scan.nextInt();
		System.out.println("Enter The password");
		password=scan.nextInt();
		

	}
	
	public void verify() throws InvalidCustomerException
	{
		if(acNo==acc && password==pwd)
		{
			System.out.println("Please proceed with Money withdrawal");
		}
		else
		{
//			InvalidCustomerException ice=new InvalidCustomerException();
//			throw ice;
//			throw new InvalidCustomerException("Invalid Credentials! Try Gain");
			InvalidCustomerException ice=new InvalidCustomerException("Invalid Credentials! Try Again");
			System.out.println(ice.getMessage());
			throw ice;
		}
	}
}
class Bank
{
	public void initiate()
	{
		ATM atm=new ATM();
		try
		{
			atm.input();
			atm.verify();
		}
		catch(InvalidCustomerException ice)
		{
			try
			{
				atm.input();
				atm.verify();
			}
			catch(InvalidCustomerException ice2)
			{
				try
				{
					atm.input();
					atm.verify();
				}
				catch(InvalidCustomerException ice3)
				{
					System.out.println("You're looking like a Legend! We cannot give more option");
				}
			}
		}
	}
}
public class CustomExceptionHandling
{

	public static void main(String[] args) 
	{
		Bank b=new Bank();
		b.initiate();

	}

}
