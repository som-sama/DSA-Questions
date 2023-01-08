class Solution:
    def findLucky(self, arr: List[int]) -> int:
        first = {}
        for i in arr:
            if i in first:
                first[i] += 1
            else:
                first[i] = 1
        lucky_no = -1
        for i in first:
            if first[i] == i:
                lucky_no = max(lucky_no, i)        

        return lucky_no






        