package starpatterns;

public class VariousStarPatterns {

	public static void main(String[] args) {		

			int n = 15;	

			for(int i = 0; i < n; i++) {			

				for(int j = 0; j < n; j++) {

					if(i == j ||  i+j == n-1 || i+j == (n-1)/2 ||  i - j == (n-1)/2 || j - i == (n-1)/2 || i+j == (n-1)+(n-1)/2 ) {

						System.out.print("*");
						
					}
					
					else {				

						System.out.print(" ");	

					}

				}//j loop

				System.out.println();

			}// i loop		

	}// main

}// class

		

	


