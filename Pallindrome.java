public class Pallindrome
{
	public static void main(String[] args)
	{
		int n=101,sum=0,rem,y=n;
		while(n>0)
		{
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		if(y==sum)
		{
			System.out.print("Pallindrome");
		}
		else
		{
			System.out.print("Not Pallindrome");
		}
	}
}