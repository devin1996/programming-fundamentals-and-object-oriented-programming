
import java.util.Arrays;


/**
 *
 * You are given an integer array nums. In one move, you can pick an index i where 0 <= i < nums.length and increment nums[i] by 1.
 * Return the minimum number of moves to make every value in nums unique.

 *  *Example 1:

 *  *Input: nums = [1,2,2]
 * Output: 1
 * Explanation: After 1 move, the array could be [1, 2, 3].

 *  *Example 2:

 *  *Input: nums = [3,2,1,2,1,7]
 * Output: 6
 * Explanation: After 6 moves, the array could be [3, 4, 1, 2, 5, 7].
 *
 */
public class MinIncrementForUnique {

    public static int minIncrementForUnique(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Sort the array
        Arrays.sort(nums);

        int moves = 0;

        // Iterate through the sorted array
        for (int i = 1; i < nums.length; i++) {
            // If the current number is not greater than the previous number
            if (nums[i] <= nums[i - 1]) {
                // Calculate the needed increment to make it unique
                int increment = nums[i - 1] + 1 - nums[i];
                // Add this increment to the current number
                nums[i] += increment;
                // Add the increment to the total moves
                moves += increment;
            }
        }

        return moves;
    }

    public static int minIncrementForUnique1(int[] nums) {
        // Manually sort the array using Bubble Sort
        bubbleSort(nums);

        // Variable to keep track of the moves needed
        int moves = 0;

        // Iterate through the array and adjust values to ensure uniqueness
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                int increment = nums[i - 1] - nums[i] + 1;
                nums[i] += increment;
                moves += increment;
            }
        }

        return moves;
    }

    private static void bubbleSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    // Swap nums[j] and nums[j + 1]
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}
