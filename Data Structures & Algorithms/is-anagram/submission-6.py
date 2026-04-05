class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        first = {}
        second = {}

        for letter in s:
            first[letter] = first.get(letter, 0) + 1

        for letter in t:
            second[letter] = second.get(letter, 0) + 1

        return first == second

        