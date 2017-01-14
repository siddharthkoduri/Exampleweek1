import java.util.*;

public class prime1
{
	public static void main(String [] args)
	{
		int count=0,max_count= 100,i;
		System.out.println("First " +max_count+" Prime Number:");
		for(int num=1;count<max_count;num++)
		{
			for(i=2; num%i!=0;i++);
			if(i==num)
			{
				System.out.println(" "+num);	
				count++;
			}
		}
	}
}
