public class Amstrong
{
	public static void main(String[] args)
	{
		
		for(int i=1;i<=1000;i++)
		{
			int x=i,y=i;
			int c=0;
			int sum1=0;
			while(y>0)
			{
				c++;
				y=y/10;
			}
			while(x>0)
			{
				int sum=1;
				int r=x%10;
				for(int j=1; j<=c; j++)
				{
					sum=sum*r;
				}
				x=x/10;
				sum1=sum1+sum;
			}
			if(sum1==i)
			{
				System.out.println(sum1);
			}
		}
	}
}