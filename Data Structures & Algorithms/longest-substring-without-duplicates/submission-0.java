class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        Set<Character> st = new HashSet<>();
        int max = 0;

        for(int r = 0; r < s.length(); r++){
            while(st.contains(s.charAt(r))){
                st.remove(s.charAt(l));
                l++;
            }
            
            st.add(s.charAt(r));
            max = Math.max(max, st.size());
        }
        return max;
    }
}
