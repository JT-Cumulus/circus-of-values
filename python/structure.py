# Python data structures testbench

# class for creating a new node
class Node:
    def __init__(self, data):
        self.prev = None
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def push(self, data):
        new_node = Node(data)
        new_node.next = self.head

        if self.heaf is not None:
            self.head.prev = new_node

            self.head = new_node

    def append(self, new_data):
        new_node = Node(new_data)

        if self.head is None:
            self.head = new_node
            return

        last = self.head
        while last.next:
            last = last.next

        last.next = new_node
        new_node.prev = last
        return

    def printList(self, node):
        print('\nTraversal forward through list')
        while node:
            print(" {}".format(node.data))
            last = node
            node = node.next

        print('\nTraversal reverse through list')
        while last:
            print(" {}".format(last.data))
            last = last.prev


# Test code

newlist = LinkedList()

newlist.append(10)
newlist.append(15)
newlist.printList(newlist.head)