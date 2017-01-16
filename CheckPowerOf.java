import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckPowerOf 
	{
	private int number;
	public CheckPowerOf(int number)
	{
		this.number = number;
	}
	public boolean check()
		{
			if(number <= 0)
			{
				return false;
			}	
		

		number = number & (number - 1);
		if(number == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException
		{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the number :");
			int num = Integer.parseInt(reader.readLine());
			CheckPowerOf checkObj = new CheckPowerOf(num);
			boolean bool = checkObj.check();
		if(bool)
		{
			System.out.println("This is power of 2");
		}
		else
		{
			System.out.println("This is Not power of 2");
		}
	}
}