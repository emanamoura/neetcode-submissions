class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int expectedSum = 0;

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            expectedSum += i;
            if(i == nums.length - 1) {
                expectedSum += i + 1;
            }
        }

        return expectedSum - sum;
    }
}
