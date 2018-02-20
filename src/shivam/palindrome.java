package shivam;


	import java.util.Scanner;



	public class palindrome {

	    public static void main(String[] args) {

	        int num,rev=0,rem,m;

	        System.out.println("enter the number to be reversed");

	        Scanner s=new Scanner(System.in);

	        num=s.nextInt();

	        m=num;

	        while(num!=0)

	        {

	            rem=num%10;

	            rev=rev*10+rem;

	            num=num/10;

	        }

	        System.out.println("the reverse number is"+rev);

	        if(m==rev)

	        {

	            System.out.println("the number is palindrome number");   

	        }

	        else

	        {

	            System.out.println("number is not a palindrome number");

	        }

	    }

}
