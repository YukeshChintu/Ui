public class CountProgram
{
	public static void main(String[] args)
	{
		int n=121211111,count=0,m=n,x=n;
		int Y=n;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		if(count%2!=0)
		{
			int s=0;
			while(m>0)
			{
				int rem=m%10;
				s=rem;
				break;
			}
			int cou=0;
			int c=0;
			while(x>0)
			{
				int r=x%10;
				c++;
				if(c==1 || c==(count/2)+1 || c==count)
				{
					if(r==s)
					{
						cou++;
					}
				}
				x=x/10;
			}
			if(cou==3)
			{
				System.out.print("Same");
			}
			else
			{
				System.out.print("Not Same");
			}
		}
		else
		{
			System.out.print(Y+" Value is Not Valid because its Even");
		}						
	}
}