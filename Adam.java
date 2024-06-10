public class Adam
{
	public static void main(String[] args)	
	{
		int n=12,sum=0;
		int n1=n*n;
		while(n>0)
		{
			int rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		int sum1=sum*sum;
		int sum2=0;
		while(sum1>0)
		{
			int rem1=sum1%10;
			sum2=sum2*10+rem1;
			sum1=sum1/10;
		}
		if(sum2==n1)
		{
			System.out.println("Adam");
		}
		else
		{
			System.out.println("Not Adam");
		}
	}
}
