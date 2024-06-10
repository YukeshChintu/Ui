public class Program1
{
	public static void main(String[] args)
	{
		int n=175145677,c=0;
		int m=n;
		while(n>0)
		{
			n=n/10;
			c++;
		}
		System.out.println("Count"+c);
		if(c%2!=0)
		{	
			int cou=0;
			while(m>0)
			{
				int rem=m%10;
				cou++;
				if(cou==c/2+1)
				{
					int count=0;
					for(int i=1;i<=rem;i++)
					{
						if(rem%i==0)
						{
							count++;
						}
					}
					if(count==2)
					{
						System.out.println("HAPPY");
					}
					else
					{		
						System.out.println("Not a Prime and Not a Happy");
					}
				}
				m=m/10;
			}
		}	
		else
		{
			System.out.println("Not Valid");
		}
	}			
}