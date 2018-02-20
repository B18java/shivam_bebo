package shivam;


	abstract class Figure{

		double dim1;

		abstract void findArea();

		abstract void findPerimeter();

		}

		class circle extends Figure

		    {

		    circle(double r)

		    {

		        dim1=r;

		    }

		    @Override

		    void findArea()

		    {

		        System.out.println("The area of circle is:"+(3.14*dim1*dim1));

		    }

		    @Override

		    void findPerimeter()

		    {

		        System.out.println("The perimeter of circle is:"+(2*3.14*dim1)); 

		    }

		    public String tostring(String s)

		    {

		       return "a"; 

		    }

		}

		class rectangle extends Figure

		{

		    double dim2;

		    rectangle(double l,double b)

		    {

		        dim1=l;

		        dim2=b;

		    }

		    @Override

		    void findArea()

		    {

		        System.out.println("Area of rectangle is:"+(dim1*dim2));

		    }

		    @Override

		    void findPerimeter()

		    {

		        System.out.println("perimeter of rectangle is:"+(2*(dim1+dim2)));

		    }

		    public String tostring(String s)

		    {

		        return "b";

		        

		    }

		}

		class triangle extends Figure

		{

		    double dim2,dim3;

		    triangle(double p,double b,double h)

		    {

		        dim1=p;

		        dim2=b;

		        dim3=h;

		    }

		    @Override

		    void findArea()

		    {double s;

		    double area;

		    s=((dim1+dim2+dim3)/2);

		    area=Math.sqrt(s*(s-dim1)*(s-dim2)*(s-dim3));

		        System.out.println("area of triangle is:"+area);

		    }

		    @Override

		    void findPerimeter()

		    {

		        System.out.println("perimeter of rectangle is:"+(dim1+dim2+dim3));  

		    }

		    public String tostring(String s)

		    {

		        return "c";

		    }

		}

		public class abst

		{

		    public static void main(String[] args)

		    {

		        Figure a[]=new Figure[6];

		        a[0]=new circle(1);

		        a[0].findArea();

		        a[0].findPerimeter();

		        a[1]=new circle(2);

		        a[1].findArea();

		        a[1].findPerimeter();

		        a[2]=new rectangle(10,20);

		        a[2].findArea();

		        a[2].findPerimeter();

		        a[3]=new rectangle(10,15);

		        a[3].findArea();

		        a[3].findPerimeter();

		        a[4]=new triangle(1,2,3);

		        a[4].findArea();

		        a[4].findPerimeter();

		        a[5]=new triangle(4,5,6);

		        a[5].findArea();

		        a[5].findPerimeter();

		    }

		}

