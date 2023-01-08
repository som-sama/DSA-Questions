# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        # create a dummy node to serve as the head of the merged list
        dummy_node = ListNode(0)
        current = dummy_node

        # iterate through both lists, adding the smaller value at each step
        while list1 is not None and list2 is not None:
            if list1.val < list2.val:
                current.next = list1
                list1 = list1.next
            else:
                current.next = list2
                list2 = list2.next
            current = current.next

        # add the remaining elements of the non-empty list
        if list1 is not None:
            current.next = list1
        if list2 is not None:
            current.next = list2

        # return the merged list, excluding the dummy node
        return dummy_node.next
