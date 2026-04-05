class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> res = new HashSet<>();
        int longest = 0;

        for(int i = 0; i < nums.length; i++){
            res.add(nums[i]);
        }

        for(int n : nums){
            if(!res.contains(n-1)){
                int length = 0;
                while(res.contains(n+length)){
                    length += 1;
                }
                longest = Math.max(length, longest);
            }
        }

        return longest;
    }
}
