package com.data.leetcodeproblems;

public class Problem1 {
	
	public static void main(String[] args) {
		
		int[] arr = {12,345,2,6,7896};
		
		System.out.println(findNumbers(arr));
		
	}
	
	public static int findNumbers(int[] nums) {
		
		int count = 0;
		
		for(int num : nums) {
			
			if(even(num)) 
			{
				count++;
			}
			
		}
		
		return count;
    }
	
	//check's if the count of number is even or not
	static boolean even(int num)
	{
		int numberOfDigits = digits(num);
		
		return numberOfDigits % 2 == 0;
	}
	
	//calculate number of digits 
	static int digits(int num)
	{
		
		if(num < 0)
		{
			num = num * -1;
		}
		
		if(num == 0)
		{
			return 1;
		}
		
//		int count = 0;
//		
//		while(num > 0)
//		{
//			count++;
//			num = num/10;
//		}
//		
//		return count;
		
		return (int)(Math.log10(num))+1;
		
	}

}


