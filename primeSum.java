import java.util.Scanner;
	class primeSum
	{
		public static void main(String args[])
		{
			int r,sum=0;	
			System.out.println("Enter the range:");
			Scanner sc= new Scanner(System.in);
			r=get.nextInt();
			System.out.println();
			for(int i =2;i<r;i++)
			{
				boolean isPrime= true;
				for (int j=2; j<1;j++)
				{	
					if(i%j==0)
					isPrime=true;	
				}
				if(isPrime==true)
				{
					System.out.println(i+" ");
					sum=sum+i;	
				}
			}
			System.out.println("Sum = "+sum);
		}
	 }

	