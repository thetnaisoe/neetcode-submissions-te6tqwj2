class Solution {
    public boolean isValid(String s) {
        Stack<Character> check = new Stack<>();
        Map<Character, Character> checkmap = new HashMap<>();
        checkmap.put(')', '(');
        checkmap.put(']', '[');
        checkmap.put('}', '{');

        for(char c : s.toCharArray()){
            if(checkmap.containsKey(c)){
                if(!check.isEmpty() && check.peek() == checkmap.get(c)){
                    check.pop();
                }else{
                    return false;
                }
            }else{
                check.push(c);
            }
        }
        return check.isEmpty();
    }
}
