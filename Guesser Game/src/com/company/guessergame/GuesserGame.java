package com.company.guessergame;

import java.util.Scanner;

class Umpire{
	
	int guesserNum; 
	
	int player1Num; 
	
	int player2Num;
	
	int player3Num;
	
	static boolean flag = true;
	
	void getGuesserNumber() {
	
	Guesser g = new Guesser();
	
	guesserNum = g.guessingNumber();
	
	}
	
	void getPlayerNumbers() {
		
		Player p1 = new Player();
		
		player1Num = p1.guessingNumber();
		
		Player p2 = new Player();
		
		player2Num = p2.guessingNumber();
		
		Player p3 = new Player();
		
		player3Num = p3.guessingNumber();
	}
	
	void compare() {
		
		if((guesserNum == player1Num) && (guesserNum == player2Num) && (guesserNum == player3Num)){					
			
			System.out.println("Game tied between Player1, Player2, and Player3");
			
			flag = true;
		}
		
		else if((guesserNum == player1Num) && (guesserNum == player2Num)){
			
			System.out.println("Game tied between Player1 and Player2");
			
			flag = true;
				
		}
		
		else if ((guesserNum == player1Num) && (guesserNum == player3Num)){
			
			System.out.println("Game tied between Player1 and Player3");
			
			flag = true;
		}
		
		else if ((guesserNum == player2Num) && (guesserNum == player3Num)){
			
			System.out.println("Game tied between Player2 and Player3");
			
			flag = true;
		}
		
		else if ((guesserNum == player1Num)){
			
			System.out.println("Congratulations! Player1 is the clear winner.");
			
			flag = true;
			
		}
		
		else if ((guesserNum == player2Num)){
			
			System.out.println("Congratulations! Player2 is the clear winner");
			
			flag = true;
		}
		
		else if ((guesserNum == player3Num)){
			
			System.out.println("Congratulations! Player3 is the clear winner.");
			
			flag = true;
		}
		
		else {
			
			flag = false;
			
			System.out.println("No one guessed it correct. Please play all the players all over again");
		}
		
	}// compare
	
} // Umpire

class Player{
	
	int guessNum;
	
	public int guessingNumber() {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Player! Please guess a whole number from 0 to 10: ");
	
	guessNum = scan.nextInt();
	
	while (!(guessNum > -1 && guessNum < 11)) {
		
		System.out.println("Wrong input! Player please guess a whole number again from 0 to 10: ");
		
		guessNum = scan.nextInt();				
	}
	
	return guessNum;
	
	}
	
}

class Guesser{
	
	int guessNum;
	
	public int guessingNumber() {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Guesser! Please guess a whole number: ");
	
	guessNum = scan.nextInt();
	
	while (!(guessNum > -1 && guessNum < 11)) {
		
		System.out.println("Wrong input! Guesser please guess a whole number again from 0 to 10: ");
		
		guessNum = scan.nextInt();				
	}
	
	return guessNum;
	
	}
}

public class GuesserGame {	

	public static void main(String[] args) {		 
			
		Umpire ump = new Umpire();
		
		ump.getGuesserNumber();
		
		ump.getPlayerNumbers();
		
		ump.compare();
		
		while(Umpire.flag == false) {
			
			ump.getGuesserNumber();
			
			ump.getPlayerNumbers();
			
			ump.compare();			
		}
		
	}// main
	
}// GuesserGame class
