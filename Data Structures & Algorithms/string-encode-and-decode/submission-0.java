class Solution {

    public String encode(List<String> strs) {
        String result = "";
        for(int i = 0; i < strs.size(); i++){
            result += String.valueOf(strs.get(i).length()) + "#" + strs.get(i);
        }
        return result;
    }

    public List<String> decode(String str) {
        int i = 0;
        List<String> ans = new ArrayList<>();

        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            i = j + 1;
            j = i + length;
            ans.add(str.substring(i,j));
            i = j;
        }
        return ans;
    }
}
