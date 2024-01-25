package Good_Pair;

class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 1, 1, 3};
        int ans = solution.numIdenticalPairs(nums);
        System.out.println("ans = " + ans);
    }

    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

}

class Solution2 {
    public static void main(String[] args) {

        Solution2 solution = new Solution2();
        int[] nums = new int[]{1, 2, 3, 1, 1, 1};
        int ans = solution.numIdenticalPairs2(nums);
        System.out.println("ans = " + ans);
    }

    public int numIdenticalPairs2(int[] nums) {
        int[] count = new int[101];
        for (int num : nums) {
            count[num]++;
        }

        int countGoodPairs = 0;
        for (int c : count) {
            countGoodPairs += c * (c - 1) / 2;
        }

        return countGoodPairs;
    }
}
