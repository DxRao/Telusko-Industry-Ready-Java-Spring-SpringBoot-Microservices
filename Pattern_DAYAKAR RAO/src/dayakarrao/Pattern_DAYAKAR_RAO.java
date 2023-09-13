package dayakarrao;

public class Pattern_DAYAKAR_RAO {

	public static void main(String[] args) {
		
		int n = 9;
		
		for(int i = 0; i< n; i++) {
			
			for(int j = 0; j < n; j++){
				//D
				if(j == 0 || i==0 && j <n-1|| i == n -1 && j < n-1  || j == n-1 && i > 0 && i < n -1 ){
		
				System.out.print("*");
				
				}
				else {
					
					System.out.print(" ");
				}
									
			}
			
			System.out.print("  ");
				
		
			for(int j = 0; j < n; j++){
				// A
				if(j  == 0 && i > 0 || i == 0 && j > 0 && j < n-1|| j == n-1 && i > 0 || i == (n-1)/2 ){
		
				System.out.print("*");
				
				}
				else {
					
					System.out.print(" ");
				}
									
			}
			
			System.out.print("   ");
				
		
			for(int j = 0; j < n; j++){
				// Y
				if(i==j && i <= (n-1)/2 || i + j == (n-1) && i <= (n-1)/2 || j == (n-1)/2 && i >= (n-1)/2){
		
				System.out.print("*");
				
				}
				else {
					
					System.out.print(" ");
				}
			}
			
			System.out.print("    ");
				
		
			for(int j = 0; j < n; j++){
				// A
				if(j  == 0 && i > 0 || i == 0 && j > 0 && j < n-1|| j == n-1 && i > 0 || i == (n-1)/2 ){
		
				System.out.print("*");
				
				}
				else {
					
					System.out.print(" ");
				}
									
			}
			
			System.out.print("   ");
				
		
			for(int j = 0; j < n; j++){
				
				// K				
				if(j  == 0 || i + j == (n-1)/2 || i -j == (n-1)/2) {
		
				System.out.print("*");
				
				}
				else {
					
					System.out.print(" ");
				}
									
			}
			
			System.out.print("");
				
		
			for(int j = 0; j < n; j++){
				// A
				if(j  == 0 && i > 0 || i == 0 && j > 0 && j < n-1|| j == n-1 && i > 0 || i == (n-1)/2 ){
		
				System.out.print("*");
				
				}
				else {
					
					System.out.print(" ");
				}
									
			}
			
			System.out.print("    ");
				
		
			for(int j = 0; j < n; j++){
				// R
				if(j  == 0 && i > 0 || i == 0  && j < (n-1)/2|| j == (n-1)/2 && i > 0 && i < (n-1)/2|| i == (n-1)/2 && j < (n-1)/2 || i-j == (n-1)/2 ){
		
				System.out.print("*");
				
				}
				else {
					
					System.out.print(" ");
				}
									
			}
			
			System.out.print("        ");
				
		
			for(int j = 0; j < n; j++){
				// R
				if(j  == 0 && i > 0 || i == 0  && j < (n-1)/2|| j == (n-1)/2 && i > 0 && i < (n-1)/2|| i == (n-1)/2 && j < (n-1)/2 || i-j == (n-1)/2 ){
		
				System.out.print("*");
				
				}
				else {
					
					System.out.print(" ");
				}
									
			}
			
			System.out.print("");
				
		
			for(int j = 0; j < n; j++){
				// A
				if(j  == 0 && i > 0 || i == 0 && j > 0 && j < n-1|| j == n-1 && i > 0 || i == (n-1)/2 ){
		
				System.out.print("*");
				
				}
				else {
					
					System.out.print(" ");
				}
									
			}
			
			System.out.print("    ");
				
		
			for(int j = 0; j < n; j++){
				
				//O
				if(j == n-n && i > 0 && i < n-1  || i==0 && j > 0 && j <n-1|| i == n -1 && j > 0 && j < n-1  || j == n-1 && i > 0 && i < n -1 ){
		
				System.out.print("*");
				
				}
				else {
					
					System.out.print(" ");
				}
									
			} // j
			
			System.out.println();
			
		} // i		
		

	} // main

}// class
