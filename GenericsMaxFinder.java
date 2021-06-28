package generics;

public class  GenericsMaxFinder <T extends Comparable<T>> {

	T num1;
	T num2;
	T num3;
	//constructor
    public GenericsMaxFinder(T num1, T num2, T num3) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}


    public T GenericMax() {
    	return GenericsMaxFinder.GenericMax(num1, num2, num3);
    }

    // Generic method to find max of any numbers
    public static <T extends Comparable<T>> T GenericMax(T num1, T num2, T num3) {
        T max = num1;
        if (num2.compareTo(max) > 0)
            max = num2;
        if (num3.compareTo(max) > 0)
            max = num3;
        return max;
    }

	// Main method
    public static void main(String[] args) {
    	  System.out.println("Maximum Integer by creating Generic class :" + new GenericsMaxFinder(3, 6, 2).GenericMax());
    	  System.out.println("Maximum Float by creating Generic class :" + new GenericsMaxFinder(3.5f, 6.56f, 3.45f).GenericMax());
    	  System.out.println("Maximum Float by creating Generic class :" + new GenericsMaxFinder("abc","abcd","abcde").GenericMax());
    }

}
