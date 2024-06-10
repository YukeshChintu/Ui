public class Strong
{
	public static void main(String[] args)
	{
		int n,i;
		for(n=1;n<=1000;n++)
		{
			int x=n;
			int s=0;
			while(x>0)
			{
				int r=x%10;
				int f=1;
				for(i=1;i<=r;i++)
				{
					f=f*i;
				}
				s=s+f;
				x=x/10;
			}
			if(s==n)
			{
				System.out.print(n);
			}
		}
	}
}
