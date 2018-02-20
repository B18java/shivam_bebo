package shivam;


	import java.util.Scanner;

	public class fibonacci {

	    public static void main(String[] args) {

	        int num,n1=0,n2=1,n3;

	        System.out.println("enter the number of digits in series");

	        Scanner s=new Scanner(System.in);

	        num=s.nextInt();

	        System.out.print(n1+" "+n2);

	        for(int i=2;i<num;i++)

	        {

	            n3=n1+n2;

	            System.out.print(" "+n3);

	            n1=n2;

	            n2=n3;

	        }

	    }

	}


