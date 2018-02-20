package shivam;


	import java.util.Scanner;



	public class add

	{

	public static void main(String args[])

	{

		Scanner s=new Scanner(System.in);

		System.out.println("enter 2 numbers");

		int a=s.nextInt();

		int b=s.nextInt();

		add(a,b);

	}

	static void add(int x,int y)

	{

		int c=x-(-y);

		System.out.println(c);

	}

	}


