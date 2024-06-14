
/**
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 * */
class RemoveDuplicates {

    public boolean containsDuplicate(int[] nums) {
        // Sort the array using Bubble Sort
        bubbleSort(nums);

        // Check for consecutive duplicates
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }

    private void bubbleSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    // Swap nums[j] and nums[j + 1]
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        RemoveDuplicates solution = new RemoveDuplicates();

        int[] nums1 = {1, 2, 3, 4, 5};
        System.out.println(solution.containsDuplicate(nums1)); // Output: false

        int[] nums2 = {1, 2, 3, 4, 1};
        System.out.println(solution.containsDuplicate(nums2)); // Output: true
    }
}
