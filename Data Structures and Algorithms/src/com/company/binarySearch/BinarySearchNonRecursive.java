package com.company.binarySearch;

public class BinarySearchNonRecursive {

	public static void main(String[] args) {
		
		// Time complexity of Binary search -> Best = Average = Worst = Big O(log n)
		 
		int[] nums = {3, 5, 7, 9, 11, 13,15};
		
		int left = 0;		
		
		int right = nums.length-1;		
		
		int searchElement = 7;
		
		int searchResult = BinarySearch(nums, searchElement, left, right);
		
		if(searchResult == -1) {
			
			System.out.println("Search element not found");			
			
		}
			
		else {
			
			System.out.println("Search element found at Index: " + searchResult);		
			
		}		
		
	}//main()	
	
	public static int BinarySearch(int nums[], int searchElement, int left, int right) {
		
		int mid;	
		
		while(left <= right) {
			
			mid = (left + right) / 2;			
		
			if (searchElement == nums[mid]) {
			
			return mid;
			}
		
		
			else if (searchElement > nums[mid]) {			
			
				left = mid + 1;
			
			}
		
			else{	
			
				right = mid-1;			
			}			
			
		}//while
		
		return -1;
		
	}//method
	
}//class