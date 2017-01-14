import java.util.ArrayList;
import java.util.List;

public class TwinPrimeNumber {
	private long number;

	public TwinPrimeNumber(long number) throws IllegalArgumentException
	{
		if (number <= 5) 
		{
			throw new IllegalArgumentException();
		}
		this.number = number;
	}

	public List<Long> printTwinPrimeNumber() 
	{
		long temp1 = 0;
		long temp2 = 0;
		List<Long> list = new ArrayList<Long>();
		if (number > 5) 
		{
			
			list.add((long) 3);
			list.add((long) 5);
		}
		for (long i = 1; i <= number; i++) 
			{
			temp1 = 6 * i - 1;
			temp2 = 6 * i + 1;
			if (temp1 > number) 
			{
				break;
			}
			list.add(temp1);
			list.add(temp2);
		}
		
		return list;
	}


}