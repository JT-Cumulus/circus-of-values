# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

l1 = [2,4,3] 
l2 = [5,6,4]

l1.reverse()
l2.reverse()

num1 = int(''.join(map(str,l1)))
num2 = int(''.join(map(str,l2)))

print(num1)

