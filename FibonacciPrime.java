public class FibonacciPrime
{
	public static void main(String[] args)
	{
		int n=10;
		int a=0;
		int b=1;
		int c;
		for(int i=1;i<=n;i++)
		{
			c=a+b;
			System.out.println("Fibonacci="+c);
			int count=0;
			for(int j=1;j<=c;j++)
			{
				if(c%j==0)
				{
					count++;
				}
			}
			a=b;
			b=c;
			if(count==2)
			{
				System.out.println("Prime="+c);
			}
		}
	}
}