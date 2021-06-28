package generics;

public class GenericsMaxFinder {
    // Main method
    public static void main(String[] args) {

        System.out.println("Maximum Value of Integer given is : " + GenericMax(6, 3, 9));//max of Int
        System.out.println("Maximum value of Float numbers given is : " + GenericMax(1.0f, 5.0f, 3.0f));//max of float
        System.out.println("Maximum value of String given is =: " + GenericMax("Apple", "Peach", "Banana"));//max of String
         }

    // Generic method to find max of any data type using compareTo method
    public static <T extends Comparable<T>> T GenericMax(T num1, T num2, T num3) {
        T max = num1;
        if (num2.compareTo(max) > 0)
            max = num2;
        if (num3.compareTo(max) > 0)
            max = num3;
        return max;
    }
}
