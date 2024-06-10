public class Fibonacci
{
	public static void main(String[] args)	
	{
		int a=0,b=1,n=15,c=0;
		for(int i=1;i<n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		System.out.println(c);
	}
}
			