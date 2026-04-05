class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> count = new HashSet<>();

        int l = 0;
        int res = 0;
        for(int r = 0; r < s.length(); r++){
            while(count.contains(s.charAt(r))){
                count.remove(s.charAt(l));
                l++;
            }
            count.add(s.charAt(r));
            res = Math.max(res, count.size());
        }
        return res;
    }
}
