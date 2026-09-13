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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevGroup = null;

        while(temp!=null){
            ListNode start = temp;
            int count = 0;
            while(temp != null && count != k){
                count++;
                temp = temp.next;
            }
            if(count < k){
                break;
            }
            ListNode groupEnd = start;
            ListNode prev = temp;

            while(start!=temp){
                ListNode curr = start.next;
                start.next = prev;
                prev = start;
                start = curr;
            }
            if(prevGroup == null){
                head = prev;
            }else{
                prevGroup.next = prev;
            }
            prevGroup = groupEnd;

        }
        return head;

    }
}