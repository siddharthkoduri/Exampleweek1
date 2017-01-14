import java.util.Scanner;

public class Cars 
	{
	
	String[] feature = { "ABS", "Rear-view Camera", "Power Steering",
			"Power windows", "AC", "FM Radio", "CD Player", "MP3 Player" };
	String[] temp = new String[8];

	public String[] printFeature(byte number) throws Exception {
		byte i = 1;
		byte j = 0;
		byte k = 0;
		while (i != 0)
			 {
			if ((number & i) != 0) 
			{
				temp[k++] = feature[j];
			}
			i <<= 1;
			j++;
		}
		return temp;
	}

	public static void main(String[] args) throws Exception 
		{
		Cars cars = new Cars();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the byte: ");
		try
			{
				byte number = scan.nextByte();
				String[] featuresOfCar = cars.printFeature(number);
				System.out.println("\car has the following features: ");
				for (int i = 0; i < featuresOfCar.length; i++) 
			{
				System.out.println(featuresOfCar[i]);
			}
		}
		catch(Exception e)
		{
			throw new Exception("Please enter the number  + e);
		}
	}
}