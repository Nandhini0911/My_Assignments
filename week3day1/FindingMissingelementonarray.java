package week3.day1.Assignment;
import java.util.Arrays;
public class FindingMissingelementonarray {

	public static void main(String[] args) 
	{
		int num[]={1, 4,3,2,8, 6, 7};  
		int count=0;
		Arrays.sort(num);
		//find difference between each number
		for(int i=0;i<num.length;i++)
		{
			int j=i+1;
			if(num[j]-num[i]==1)
			{
				count=j;
			}
			else
			{
				break;
			}
		}
		int missingnumber=num[count]+1;
		System.out.println("Missing element on array : " +missingnumber);
	}
}
