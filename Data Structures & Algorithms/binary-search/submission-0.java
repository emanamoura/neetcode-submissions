class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0 ) {
            return -1;
        }

        return find(nums, 0, nums.length - 1, target);
       
    }

    public int find(int[] nums, int beg, int end, int target) {
        int middle = (Math.abs(beg) + Math.abs(end)) / 2;   
        
        if(nums[middle] == target) {
            return middle;
        }

        if(end <= beg) {
            return -1;
        }
    
        if(nums[middle] < target) {
            return find(nums, middle + 1, end, target);
        } else {
            return find(nums, beg, middle - 1, target);
        }
    }   
}
