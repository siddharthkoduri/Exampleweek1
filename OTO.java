import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class OTO
	{
	private static int number;
	private static int[] list;

	public OTO(int number) 
	{
		OTO.number = number;
		list = new int[number];
	}

	public int findOddOccurrance() 
	{
		int y = list[0];
		for (int i = 1; i < list.length; i++) 
		{
		y = y ^ list[i];
		}
		return y;
	}

	public static void main(String args[]) 
		{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter length of number list: ");
		OTO oddObjList = new OTO(scan.nextInt());
		System.out.print("Enter the numbers: ");
		for (int i = 0; i < number; i++) 
		{
			list[i] = scan.nextInt();
		}
		int oddNum = oddObjList.findOddOccurrance();
		System.out.print("The odd occuring number is: " + oddNum);
	}
}