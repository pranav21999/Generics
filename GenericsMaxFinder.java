package generics;

//generics class and extends Comparable method for it
public class GenericsMaxFinder <T extends Comparable>{
    //generics Array
	private T[] inputArray;

	//constructor
    public GenericsMaxFinder(T[] inputArray) {
        this.inputArray=inputArray;
    }

    //method to find max of array of any data type
    private static <T extends Comparable> void getMaximum(T[] array){
        T max = array[0];
        for (int i=0;i<array.length; i++){
            if (array[i].compareTo(max)>0){
                max=array[i];
            }
        }
        System.out.println("Maximum : "+max);

    }
    
    //main method
    public static void main(String[] args) {
        // Declaring array of  INTEGER,FLOAT,STRING
    	Integer[] intArray={10,9,8,7,6,5,56};
        Double[] doubleArray={3.3,6.67,4.56,89.43};
        String[] stringArray={"a","abc","abcgss","abcde"};
        
        System.out.println("maximum of integer [10,9,8,7,6,5,56] values are");
        GenericsMaxFinder.getMaximum(intArray);
        
        System.out.println("maximum of integer [3.3,6.67,4.56,89.43] values are");
        GenericsMaxFinder.getMaximum(doubleArray);
        
        System.out.println("maximum of integer [ a,abc,abcgss,abcde ] values are");
        GenericsMaxFinder.getMaximum(stringArray);
    }
}
