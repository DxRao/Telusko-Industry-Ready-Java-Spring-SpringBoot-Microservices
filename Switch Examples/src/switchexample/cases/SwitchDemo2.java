package switchexample.cases;

public class SwitchDemo2 {

	public static void main(String[] args) {
		
		String  name = "Sunday";
		
		switch(name) {
		
		case "Monday" -> System.out.println("6 am");			
			
		
		case "Tuesday", "Wednesday", "Thursday" -> System.out.println("7 am");			
			
			
		case "Friday" -> System.out.println("5 am");			
			
		
		case "Saturday", "Sunday" -> System.out.println("8 am");			
			
			
		default -> System.out.println("Input correct Day");	
		
		
		}//switch

	}//main

}
