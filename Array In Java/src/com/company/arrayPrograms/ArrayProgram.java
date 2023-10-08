package com.company.arrayPrograms;

public class ArrayProgram {

	public static void main(String[] args) {
		
		//int[] ar = new int[5];
		 int[] ar = {1,2,3,4,5};
		
		//int[][] arr = new int[2][2];		
		int[][] arr = {{1,2}, {3,4}};
		
		
		int[][][] arrr = new int[2][2][2]; // in Zagged Array - last column left empty
		// arrr[][][] = {{{{1,2},{3,4}}},{{{5,6},{7,8}}}};
		
		arrr[0][0][0] = 10;
		arrr[0][0][1] = 11;
		arrr[0][1][0] = 12;
		arrr[0][1][1] = 13;
		arrr[1][0][0] = 14;
		arrr[1][0][1] = 15;
		arrr[1][1][0] = 16;
		arrr[1][1][1] = 17;
		
		
		
		System.out.print("Elements in 1-D Array are: ");
		for(int myArray: ar) {// 1-D array printing
			
			System.out.print(myArray + " ");
			
		}
		
		System.out.println();
		System.out.print("Initial elements in 2-D Array are: ");
		
		for(int[] myArray: arr) {// 2-D array printing
			for(int arrP: myArray) {
			
			System.out.print(arrP + " ");
			
			}
			
		}
		
		arr[0][0] = 6;
		arr[0][1] = 7;
		arr[1][0] = 8;
		arr[1][1] = 9;
		
		System.out.println();
		System.out.print("Assigned elements later on in 2-D Array are( through 2-for loops) : ");
		
		for(int i =0; i < arr.length; i++){ // length of row
			for(int j =0; j < arr[i].length; j++){// length of column
				
				System.out.print(arr[i][j] + " ");				
			}			
		}		
		
		System.out.println();
		System.out.print("Assigned elements later on in 2-D Array are (through 2-enhanced for loops): ");
		
		for(int[] myArray: arr) {// 2-D array printing
			for(int arrP: myArray) {
			
			System.out.print(arrP + " ");
			
			}
			
		}
		
		System.out.println();
		System.out.print("Elements in 3-D Array are: ");
		
		for(int[][] myArray: arrr) {// 3-D array printing
			for(int[] arrP: myArray) {
				for(int arP: arrP) {
			
					System.out.print(arP + " ");
				}
			
			}
			
		}
	}
}
