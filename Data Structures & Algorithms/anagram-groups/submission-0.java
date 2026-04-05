class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> m = new HashMap<>();

        for(String s : strs){
            char[] cArray = s.toCharArray();
            Arrays.sort(cArray);
            String sorted = new String(cArray);
            m.putIfAbsent(sorted, new ArrayList<>());
            m.get(sorted).add(s);
        }
        return new ArrayList<>(m.values());
    }
}
