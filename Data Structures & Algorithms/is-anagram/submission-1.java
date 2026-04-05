class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mapOne = new HashMap<>();
        HashMap<Character, Integer> mapTwo = new HashMap<>();

        for(char c : s.toCharArray()){
            if(mapOne.containsKey(c)){
                mapOne.put(c, mapOne.get(c) + 1);
            }else{
                mapOne.put(c, 1);
            }
        }

        for(char c : t.toCharArray()){
            if(mapTwo.containsKey(c)){
                mapTwo.put(c, mapTwo.get(c) + 1);
            }else{
                mapTwo.put(c, 1);
            }
        }

        if(mapOne.equals(mapTwo)){
            return true;
        }else {
            return false;
        }
    }
}
