# Solution for house robber leetcode which uses bottoms-up approach
class Solution:
    def rob(self, nums) -> int:
        if len(nums) == 0:
            return 0

        # generating empty dict for memoization
        memo = {}
        memo[0] = 0
        memo[1] = nums[0]
        for i in range(1, len(nums)):
            value = nums[i]
            memo[i+1] = max(memo[i], memo[i-1] + value)
        print(memo)
        return memo[len(nums)]

nums = [2,7,9,3,1]

c = Solution()
print(c.rob(nums))