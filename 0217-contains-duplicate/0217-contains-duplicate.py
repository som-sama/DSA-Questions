class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        sets = set()
        for i in nums:
            if i in sets:
                return True
            sets.add(i)


        return False
        
        