package shivam;

public class reverse1 {
	  public static void main(String[] args) {

	        int count=0;

	        String a="",b="";

	        String s="City Chandigarh is Beautiful";

	        String s1=new String("CITY CHANDIGARH IS BEAUTIFUL");

	        for(int i=0;i<s.length();i++)

	        {

	        if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')   

	        {

	            count++;

	        }

	        }

	        System.out.println("Vowels are"+" "+count);

	       

	        int i,j=0;

	        for(i=0;i<s.length();i++)

	        {

	       

	            if(s.charAt(i)==' '|| i==s.length()-1)

	            {

	                if(i==s.length()-1)

	                a=s.substring(j,i+1);

	                else

	                    a=s.substring(j,i);

	                System.out.println("a="+a);

	            for(int k=a.length()-1;k>=0;k--)

	            {

	                b=b+a.charAt(k);

	            }

	            b=b+" ";

	            System.out.println("b="+b);

	            j=i+1;

	            }

	           

	           

	        }

	       

	        }

}
