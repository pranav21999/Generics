package generics;

public class GenericsMaxFinder {
	//main  method
	public static void main(String[] args) 
	{
		Integer a=2,b=7,c=5;
		Float p=4.f,q=2.3f,r=9.8f;
		String x="abc",y="aaddf",z="qertgh";
		findMaxInt(a,b,c); 
		findMaxFloat(p,q,r); 
		findMaxString(x,y,z); 
		
		
	}
	//max of three Int
	public static void findMaxInt(Integer a,Integer b,Integer c)
	{
		Integer max=a;
		if(b.compareTo(max)>0)
			max=b;
		else if(c.compareTo(max)>0)
			max=c;
		System.out.printf("maximum of numbers: [%s ,%s, %s]is %s ",a,b,c,max);			
	}
	//max of three Float
	public static void findMaxFloat(Float p,Float q,Float r)
	{
		Float max=p;
		 if (q.compareTo(max)>0) {
	            max = q;
	        }
		 else if (r.compareTo(max)>0) {
	            max = r;
	        }
	        System.out.printf("Max value of %s %s %s is : %s\n", p,q,r, max);			
	}
	//max of three String
	public static void findMaxString(String x,String y,String z)
	{
		String max=x;
		 if (y.compareTo(max)>0) {
	            max = y;
	        }
		 else if (z.compareTo(max)>0) {
	            max = z;
	        }
	        System.out.printf("Max value of %s %s %s is : %s\n", x,y,z ,max);			
	}



}
