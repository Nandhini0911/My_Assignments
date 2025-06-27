package week1.day2;

public class Palindrome {

	public static void main(String[] args) 
	{
		int input=121,reverse=0,temp;  // Initialize input number, reverse and temporary variable//
		int initialValue=input;		   // Assign input number to initialValue //
		while(initialValue>0)		   // Use while loop until initial value is greater then 0//
		{	
			temp=initialValue%10;      // Modules initial value to find the reminder and save it to temporary variable//
			initialValue=initialValue/10;  //Divide the initial value with 10 and find the whole number and save it to initial value//
			reverse=reverse*10+temp;       //Multiply 10 to the reversed number and add temporary number to it//
		}
		if(input==reverse)              // Check if input value and reverse number are same and print the output//
		{
		System.out.println(input + " is Palindrome ");
		}
		else
		{
		System.out.println(input + " is not Palindrome ");
		}
	}
}
