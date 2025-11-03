import java.util.Arrays;
/**
 * ArrayMethods is a collection of methods for arrays, including counting, sums, averages, maximum value & maximum value location.
 *
 * @author Jacob Antonio
 * @version 1.0
 * @since 11/2/2025
 */
public class ArrayMethods
{
    private int[] myArray = {7,8,8,3,4,9,8,7};
    /**
     * counts the number of elements in an array
     * @return count number of elements in the array
     */
    public int count() {
        int count = 0;
        for (int element : myArray) {
        count++;
        }
        return count;
    }
    /**
     * finds the sum of all elements in an array
     * @return sum value of all elements in the array
     */
    public int sum() {
        int sum = 0; 
        for (int i = 0; i < myArray.length; i++) {
        sum += myArray[i];
        }   
        return sum;
    }
    /**
     * finds the average value of the elements in an array
     * @ return avg the average valueof the elements in the array
     */
    public double average() {
        double avg = 0; 
        for (int i = 0; i < myArray.length; i++) {
        avg += myArray[i];
        }   
        avg = avg / myArray.length;
        return avg;
    }
    /**
     * finds the element with the greatest value in an array
     * @return max the greatest value in the array
     */
    public int findMax() {
        int max = myArray[0];
        for (int i = 1; i <myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        return max;
    }
    /**
     * finds the index of the element with the greatest value in an array
     * @return maxIndex the index number of the greatest value in the array
     */
    public int findIndexOfMax() {
        int max = myArray[0];
        int maxIndex = 0;
        for (int i = 1; i <myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    /**
    prints an int array, nicely formatted
    @param inArray int array to print
    */
    public void print(int[ ] inArray)
    {
        System.out.print("{");
        int i;
        // print elements before the last, separated by commas
        for (i = 0; i < inArray.length - 1; i++)
        System.out.print(inArray[i] + ", ");
        // print last element. Careful here to handle length 0
        if (inArray.length > 0)
        System.out.print(inArray[i]);
        System.out.println("}");
    }
}