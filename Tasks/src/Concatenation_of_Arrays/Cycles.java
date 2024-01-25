package Concatenation_of_Arrays;

/*
 *Concatenation of Array*

 Given an integer array `nums` of length `n`;
 You want to create an array `ans` of length `2n` where `ans[i]` == `nums[i]` and `ans[i + n]` == nums[i] for 0 <= i < n (0-indexed).

 Specifically, `ans` is the concatenation of two `nums` arrays.
 Return the array ans.
*/

class ForEachCycle {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3};
        int[] ans = solution.getConcatenation(nums);
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }

    static class Solution {
        public int[] getConcatenation(int[] nums) {
            int n = nums.length;
            int[] ans = new int[2 * n];
            int index = 0;
            for (int num : nums) {
                ans[index] = num;
                ans[index + n] = num;
                index++;
            }
            return ans;
        }
    }
}

class CycleWhile {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3};
        int[] ans = solution.getConcatenation(nums);
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }

    static class Solution {
        public int[] getConcatenation(int[] nums) {
            int n = nums.length;
            int[] ans = new int[2 * n];
            int i = 0;
            while (i < n) {
                ans[i] = nums[i];
                ans[i + n] = nums[i];
                i++;
            }
            return ans;
        }
    }
}

class ForCycle {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 4, 6};
        int[] ans = solution.getConcatenation(nums);
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }

    static class Solution {
        public int[] getConcatenation(int[] nums) {
            int n = nums.length;
            int[] ans = new int[2 * n];
            for (int i = 0; i < n; i++) {
                ans[i] = nums[i];
                ans[i + n] = nums[i];
            }
            return ans;
        }
    }
}