package switchexample.cases;

public class SwitchDemo {

	public static void main(String[] args) {
		
		String  name = "Wednesday";
		
		switch(name) { // Check/write variable-name
		
		case "Monday": // Check/match/write "variable value"
			System.out.println("Wake up at 6 am");
			break;
		
		case "Tuesday", "Wednesday", "Thursday":
			System.out.println("Wake up at 7 am");
			System.out.println("Try again at 7:30 am");
			break;
			
		case "Friday":
			System.out.println("Wake up at 5 am");
			break;
		
		case "Saturday", "Sunday":
			System.out.println("Wake up at 8 am");
			break;
			
		default:
			System.out.println("Input correct Day");				
		
		
		}//switch

	}//main

}
