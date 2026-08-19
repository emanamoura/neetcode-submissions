class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0 ) {
            return -1;
        }

        return find(nums, 0, nums.length - 1, target);
       
    }

    public int find(int[] nums, int low, int high, int target) {
        int middle = (low + high) / 2;   
        
        if(nums[middle] == target) {
            return middle;
        }

        if(high <= low) {
            return -1;
        }
    
        if(nums[middle] < target) {
            return find(nums, middle + 1, high, target);
        } else {
            return find(nums, low, middle - 1, target);
        }
    }   
}
