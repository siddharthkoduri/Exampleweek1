import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumCubesNaturalNumbers 
{
	private int n;

	public SumCubesNaturalNumbers(int n) 
	{
		if(n<=0)
	{
		throw new NumberFormatException();
	}
		this.n = n;
}

	public int sumCubesNaturalNumbers() 
	{
		int sum = ((n * (n + 1)) / 2) * ((n * (n + 1)) / 2);
		return sum;
	}

	public static void main(String[] args) throws NumberFormatException,
			IOException 
	{
		System.out.print("Enter the Number: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		SumCubesNaturalNumbers obj = new SumCubesNaturalNumbers(
				Integer.parseInt(reader.readLine()));
		int sum = obj.sumCubesNaturalNumbers();
		System.out.println("The sum of cube N natural numbers is : " + sum);
	}
}