package week3.day1.Assignment;

public class FindIntersection {

	public static void main(String[] args) 
	{
		int a[]={3,2,11,4,6,7}; 
		int b[]={1,2,8,4,9,7}; 
		
		System.out.print("Matching elements are:");
		
		for(int i=0;i<a.length;i++)  //This loop compares each element of A array and compares with B array
		{
			for(int j=0;j<b.length;j++) //This loop gives B array from 1st to last element for each ith iteration
			{
				if(a[i]==b[j])
				{
					System.out.print(" "+ a[i]);
				}
			}
		}
	}
}
