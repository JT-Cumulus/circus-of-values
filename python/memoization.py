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

# Solution for buy and sell stock with cooldown

def maxProfit(prices):
    memo = {}
    def dfs(i, buying):
        if i >= len(prices):
            return 0
        # if already in dp
        if (i, buying) in memo:
            return memo[(i, buying)]

        if buying:
            buy = dfs(i + 1, not buying) - prices[i]
            cooldown = dfs(i + 1, buying)
            memo[(i, buying)] = max(buy, cooldown)
        else:
            sell = dfs(i + 2, not buying) + prices[i]
            cooldown = dfs(i + 1, buying)
            memo[(i, buying)] = max(sell, cooldown)
        return memo[(i, buying)]

    return dfs(0, True)

test = [1,2,7,0,2]
print(maxProfit(test))
