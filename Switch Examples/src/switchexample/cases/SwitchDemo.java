package switchexample.cases;

public class SwitchDemo {

	public static void main(String[] args) {
		
		String  name = "Sunda";
		
		switch(name) {
		
		case "Monday":
			System.out.println("6 am");
			break;
		
		case "Tuesday", "Wednesday", "Thursday":
			System.out.println("7 am");
			break;
			
		case "Friday":
			System.out.println("5 am");
			break;
		
		case "Saturday", "Sunday":
			System.out.println("8 am");
			break;
			
		default:
			System.out.println("Input correct Day");				
		
		
		}//switch

	}//main

}
