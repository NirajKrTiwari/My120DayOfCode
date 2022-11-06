package Day5;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    return new int[] { i, j };

                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6 };
        int target = 4;
        TwoSum s1 = new TwoSum();
        s1.twoSum(a, target);

    }
}