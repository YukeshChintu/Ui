public class Prem
{
	public static void main(String[] args)
	{
		int a,sum=0,sum1=0,sum2=0;
		for(a=0;a<=10;a++)
		{
			if(a%2==0)
			{
				sum=sum+a;
			}
			else
			{
				sum1=sum1+a;
			}
		}
		System.out.println(sum);
		System.out.println(sum1);
		sum2=sum+sum1;
		System.out.println(sum2);
	}
}
				
		