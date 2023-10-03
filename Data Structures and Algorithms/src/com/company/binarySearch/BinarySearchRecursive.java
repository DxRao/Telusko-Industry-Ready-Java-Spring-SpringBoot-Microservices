package com.company.binarySearch;

public class BinarySearchRecursive {

	public static void main(String[] args) {
		 
		int[] nums = {3, 5, 7, 9, 11, 13,15};
		
		int left = 0;		
		
		int right = nums.length-1;		
		
		int searchElement = 11;
		
		int searchResult = BinarySearch(nums, searchElement, left, right);
		
		if(searchResult == -1) {
			
			System.out.println("Search element not found");			
			
		}
			
		else {
			
			System.out.println("Search element found at Index: " + searchResult);		
			
		}		
		
	}//main()	
	
	public static int BinarySearch(int nums[], int searchElement, int left, int right) {			
		
		if(left <= right) { // Outer if loop
			
			int mid = (left + right) / 2; // mid scope is accessible			
		
			if (searchElement == nums[mid]) {
			
				return mid;
			}		
		
			else if (searchElement > nums[mid]) {			
			
				return BinarySearch(nums, searchElement, mid+1, right);
			
			}
		
			else if(searchElement < nums[mid]) {			
			
				return BinarySearch(nums, searchElement, left, mid-1);			
			}			
		
		}//if
		
		return -1;
		
	}//method
		
}//class