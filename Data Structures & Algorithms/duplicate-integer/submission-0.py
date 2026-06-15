class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        counter_map = {}
        hasDuplicate = False
        for i in range(0, len(nums)):
            if counter_map.get(nums[i]) == None:
                counter_map[nums[i]] = 1;
            else:
                hasDuplicate = True
        return hasDuplicate

        