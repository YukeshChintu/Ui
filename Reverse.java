public class Reverse
{
	public static void main(String[] args)
	{
		int n=143,r,s=0;
		while(n>0)
		{
			r=n%10;		
			s=s*10+r;
			n=n/10;
		}
		System.out.print(s);
	}
}