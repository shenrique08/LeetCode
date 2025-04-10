import java.util.Arrays;



// Solution without looking up
// Overall complexity is O(n²)
public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int target = 2;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] indexTarget = new int[2];
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    indexTarget[0] = i;
                    indexTarget[1] = j;
                    return indexTarget;
                }
            }
        }

        throw new IllegalArgumentException("NO solution found!");
    }
}
