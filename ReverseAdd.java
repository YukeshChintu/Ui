public class ReverseAdd
{
	public static void main(String[] args)
	{
		int i,s,x,r;
		for(i=1000;i>=1;i--)
		{
			s=0;
			x=i;
			while(x>0)
			{
				r=x%10;
				s=s*10+r;
				x=x/10;
			}
			System.out.print("\t"+s);
		}
	}
}