package generics;

public class GenericsMaxFinder {

	public static void main(String[] args) 
	{
		Integer a=2,b=7,c=5;
		findMaxInt(a,b,c); 
	}
	
	public static void findMaxInt(Integer a,Integer b,Integer c)
	{
		Integer max=a;
		if(b.compareTo(max)>0)
			max=b;
		else if(c.compareTo(max)>0)
			max=c;
		System.out.printf("maximum of numbers: [%s ,%s, %s]is %s ",a,b,c,max);			
	}

}
