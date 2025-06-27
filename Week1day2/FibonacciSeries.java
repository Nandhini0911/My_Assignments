package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		int n=8,a=0,b=1,temp=0;            //Initialize maximum number of values to be printed and temporary variables//
		System.out.println("Fibonacci Series for first "+ n + " numbers");
		for (int i = 0; i < n; i++)        
		{	
			System.out.println(a);        //Print the series//
			temp=b;						  // Save the second value in temp variable//
			b=a+b;                        //add first and second value and assign it in second variable//
			a=temp;						  //Assign temp value to the first variable//
		}

	}

}


