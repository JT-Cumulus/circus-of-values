'''
def longestCommonSubsequence(text1: str, text2: str) -> int:
    if len(text1) == 0 or len(text2) == 0:
        return 0
    if text1[-1] == text2[-1]:
        print(longestCommonSubsequence(text1[:-1], text2[:-1]))
        return 1 + (longestCommonSubsequence(text1[:-1], text2[:-1]))
    else:
        return max(longestCommonSubsequence(text1[:-1], text2), longestCommonSubsequence(text1, text2[:-1]))
'''

def longestCommonSubsequence(text1: str, text2: str) -> int:
        memo = [[-1 for j in range(len(text2) + 1)] for i in range(len(text1) + 1)]
        def driver(t1, t2):
            if len(t1) == 0 or len(t2) == 0:
                return 0
            if memo[len(t1)][len(t2)] != -1:
                return memo[len(t1)][len(t2)]
            if t1[-1] == t2[-1]:
                memo[len(t1)][len(t2)] = 1 + driver(t1[:-1], t2[:-1])
                return memo[len(t1)][len(t2)]
            else:
                memo[len(t1)][len(t2)] =  max(driver(t1[:-1],t2), driver(t1,t2[:-1]))
                return memo[len(t1)][len(t2)]

        driver(text1, text2)
        return memo[-1][-1]


text1="ocxptulqrsvwf" 
text2="shmtulqrypy"

print(longestCommonSubsequence(text1, text2))