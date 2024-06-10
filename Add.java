public class Add
{
	public static void main(String[] args)
	{
		int i,s,x,r;
		for(i=1;i<=1000;i++)
		{
			s=0;
			x=i;
			while(x>0)
			{
				r=x%10;
				s=s+r;
				x=x/10;
			}
			System.out.println(s);
		}
	}
}