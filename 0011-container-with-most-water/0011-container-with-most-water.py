class Solution:
    def maxArea(self, height: List[int]) -> int:
        n = len(height)
        if n < 2:
            return 0
        maxArea = 0
        left = 0
        right = n-1
        while left < right:
            minHeight = min(height[left], height[right])
            area = minHeight * (right - left)
            maxArea = max(maxArea, area)
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        return maxArea