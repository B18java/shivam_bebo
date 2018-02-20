package shivam;


	import java.util.*;

	public class sumofprime 

	{

		public static void main(String args[])

		{

			int n,count=0,sum=0;

			System.out.println("enter a number");

			Scanner sc=new Scanner(System.in);

			n=sc.nextInt();

			for(int i=1;i<=200;i++)

			{

				if(prime(i) && count<=n)

				{

					sum=sum+i;

					count++;

				}

			}

			System.out.println("sum of "+n+" prime no's is "+sum);

		}

		static boolean prime(int k)

		{

			boolean p=true;

			for(int j=2;j<=k/2;j++)

			{

				if(k%j==0)

				{

					p=false;

					break;

				}

			}

			return p;

		}

}
