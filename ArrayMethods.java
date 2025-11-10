import java.util.Arrays;
/**
 * ArrayMethods is a collection of methods for arrays
 * @author Jacob Antonio
 * @version 1.1
 * @since 11/9/2025
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
    public void print(int[ ] inArray) {
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
    /**
     * searches for the rightmost instance of value and records its index
     * @param key the value being searched for
     * @return keyIndex index of last instance key. defaults to -1 if key is not found. 
     */
    public int findLast(int key) {
    int keyIndex = -1;
        for (int i = myArray.length - 1; i >= 0; i--) {
        if (myArray[i] == key) {
            keyIndex = i;
            break;
        }
    }
    return keyIndex;
    }
    /**
     * Creates an array listing the indexes of all occurences of a value, key
     * @param key value being searched for
     * @return allIndexes array of all indexes of key
     */
    public int[] findAll(int key) {
        int count = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == key) {
                count++;
            }
        }
        int[] allIndexes= new int[count];
        int index = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == key) {
            allIndexes[index] = i;
            index++;
        }
        }
        return allIndexes;
    }
    /**
     * simple getter for int[] myArray
     * @return the integer getArray
     */
    public int[] getArray() {
        return myArray;
    }
    /**
    * Creates and returns a copy of myArray.
    * @return a new array that is a copy of the internal array
    */
    public int[] copyArray() {
        return Arrays.copyOf(myArray, myArray.length);
    }
    /**
     * replaces inArray with an array with values in reverse order to inArray
     * @param inArray the array to be reversed
     * @return inArray with values reversed
     */
    public int[] reverseArray(int[] inArray) {
    int left = 0;
    int right = inArray.length - 1;
    while (left < right) {
        int temp = inArray[left];
        inArray[left] = inArray[right];
        inArray[right] = temp;
        left++;
        right--;
    }
    return inArray;
    }
}