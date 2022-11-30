"""
Given an array of integers nums and an integer target, 
return indices of the two numbers such that they add up to target.
"""
from itertools import combinations

nums = [2,7,11,15]
target = 9

def listsum(input_list, target_number):
    new_list = {}
    
    for idx, value in enumerate(input_list):
        if target_number - value in new_list:
            return [new_list[target_number - value], idx]
        else:
            new_list[value] = idx

listsum(nums, target)

# solution

