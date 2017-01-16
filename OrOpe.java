import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrOpe 
	{
		public static void main(String[] args) 
			{
				int i = 5;
				int j = 7;
				int k = 4;
				if (i > j || ++k == i) 
				{ 
					System.out.print("Namaste ");
				}
				if (i > j | k-- == i) 
				{ 
					System.out.println("Vanakkam ");
				}
				if (i < j || ++k == i) 
				{ 
					System.out.print("World\n");
				}
		System.out.println("i = " + i + ", j = " + j + ", k = " + k);
			}
	}