package week1.day2;

public class IsPrime {

	public static void main(String[] args) 
	{
		int n=13, count=0;           //Declare number(n) as 13//
		for(int i=2; i<=n/2; i++)    //Start a for loop from 2 to n/2(a number is not divisible by more then its half)//
		{
			if(n%i==0)               //check if the number is divisible by any number between 2 to n/2//
			{
				count=1;             //Declare count as 1 if it gets divided by any number between 2 to n/2//
				break;               // break the loop//
			}
		}
		if(count==1)                 //Depending upon count value print the expected statement//
		{
			System.out.println("is not prime");
		}
		else
		{
			System.out.println("isprime");
		}
	}
}
