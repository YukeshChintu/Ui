public class Prime1
{
	public static void main(String[] args)
	{
		int n=8,count=0;
		for(int i=1;i<=n;i++)
		{	
			if(n%i==0)			
			{
				count++;
			}
			
		}
		if(count==2)
		{
			System.out.print("Prime");
		}
		else
		{
			System.out.print("Not Prime");
		}
	}
}