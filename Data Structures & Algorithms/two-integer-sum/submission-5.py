class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        before = {}
        for i, num in enumerate(nums):
            check = target - nums[i]
            if check in before:
                return [before[check], i]
            before[num] = i
        return