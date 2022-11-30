# Given an array of integers arr, return true if the number of occurrences 
# of each value in the array is unique, or false otherwise.

arr = [1,2,2,1,1,3]

unique_numbers = set(arr)
unique_counts = []

for items in unique_numbers:
    unique_counts.append(arr.count(items))

print(set(unique_counts))

# solution to leetcode

class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        unique_numbers = set(arr)
        unique_counts = []

        for items in unique_numbers:
            unique_counts.append(arr.count(items))
        if unique_counts == list(dict.fromkeys(unique_counts) ):
            return True
        else:
            return False