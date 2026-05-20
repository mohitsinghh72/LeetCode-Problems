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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<>();

        int count = 0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        temp = head;
        for(int i = 0;i<count/2;i++){
            st.push(temp.val);
            temp = temp.next;
        }

        if(count%2 != 0){
            temp = temp.next;
        }
        while(!st.isEmpty()){
            if(temp.val == st.pop()){
                temp = temp.next;
            }else{
                return false;
            }
        }
        return true;

    }
}