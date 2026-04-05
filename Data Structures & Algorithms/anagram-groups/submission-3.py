class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        check = defaultdict(list)
        for s in strs:
            sorted_string = ''.join(sorted(s))
            check[sorted_string].append(s)
        return list(check.values())