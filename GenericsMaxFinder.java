package generics;

public class GenericsMaxFinder {
	//main method
	public static void main(String[] args) 
	{
		Integer a=2,b=7,c=5;
		Float p=4.f,q=2.3f,r=9.8f;
		findMaxInt(a,b,c); 
		findMaxFloat(p,q,r); 
	}

	//method to find max of  Integer
	public static void findMaxInt(Integer a,Integer b,Integer c)
	{
		Integer max=a;
		if(b.compareTo(max)>0)
			max=b;
		else if(c.compareTo(max)>0)
			max=c;
		System.out.printf("maximum of numbers: [%s ,%s, %s]is %s ",a,b,c,max);
	}
	//method to find maximum of three float
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


}
