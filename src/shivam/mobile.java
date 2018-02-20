package shivam;



	  import java.util.Scanner;



	  public class mobile {



	      public static void main(String[] args) {

	          Scanner s=new Scanner(System.in);

	          System.out.println("Enter your mobile number");

	          long x=s.nextLong();

	         

	          String s1= String.valueOf(x);

	         

	          String s2="";

	          int count;

	          for(int i=0;i<s1.length();i++)

	          {count=1;

	              if((s2.indexOf(s1.charAt(i))==-1))

	              {

	              for(int j=i+1;j<s1.length();j++)

	              {

	                  if(s1.charAt(i)==s1.charAt(j))

	                  {

	                      count++;

	                  }

	              }

	              System.out.println(s1.charAt(i)+" is "+count+" no. of times");

	              s2=s2+s1.charAt(i);

	              }

	          }



	      }
}
