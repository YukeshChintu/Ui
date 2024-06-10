public class HappyNumber1
{
	public static void main(String[] args)
	{
		int j,s=0;
		for (int i=1;i<=1000;i++)
		{
			j=i;
			while(j>0)
			{
				s=0;
				while(j>0)
				{
					int r=j%10;
					s=s+r*r;
					j=j/10;
				}
				if(s>9)
				{
					j=s;
				}
			}
			if(s==1)
			{
				System.out.print("\t"+i);
					
			}
		}
	}
}