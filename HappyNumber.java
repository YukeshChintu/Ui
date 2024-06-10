public class HappyNumber
{
	public static void main(String[] args)
	{
		int n=48;
		int m=n;
		while(n>0)
		{
			int s=0;
			while(n>0)
			{
				int r=n%10;
				s=s+r*r;
				n=n/10;
			}
			if(s>9)
			{
				n=s;
			}
			else if(s==1)
			{
				System.out.print(m+"Is a Happy Number");
			}
			else
			{
				System.out.print(m+"Not a Happy Number");
			}
		}
	}
}