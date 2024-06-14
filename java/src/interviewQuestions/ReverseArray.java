
/**
 * Write a Java method that takes an array of integers and returns a new array with the elements in reverse order.
 */
class ReverseArray {

    public static int[] reverseArray(int[] array) {
        if (array == null) {
            return null;
        }

        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] reversedArray = reverseArray(originalArray);

        System.out.println("Original array: " + java.util.Arrays.toString(originalArray));
        System.out.println("Reversed array: " + java.util.Arrays.toString(reversedArray));
    }
}
