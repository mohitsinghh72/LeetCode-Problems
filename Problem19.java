/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast ahead by n steps
        for(int i = 0; i < n; i++){
            fast = fast.next;
        }

        // Move both pointers until fast reaches the last node
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        // Delete the nth node
        slow.next = slow.next.next;

        return dummy.next;
    }
}

