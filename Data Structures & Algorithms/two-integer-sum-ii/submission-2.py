class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        numMap = collections.defaultdict()
        
        for i, num in enumerate(numbers):
            check = target - num
            if check in numMap:
                return [numMap[check], i + 1]
            numMap[num] = i + 1
        return
            
