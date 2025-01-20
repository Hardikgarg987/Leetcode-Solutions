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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode temp1 = l1;
        ListNode prev = null;
        while(l1 != null && l2 != null){
            prev = l1;
            int val = l1.val + l2.val + carry;
            carry = val/10;
            l1.val = val%10;
            l1 = l1.next;
            l2 = l2.next;
        }
        if(l1 == null){
            prev.next = l2;
            l1 = prev.next;
        }
        while(carry > 0 && l1 != null){
            prev = l1;
            int val = l1.val + carry;
            carry = val/10;
            l1.val = val%10;
            l1 = l1.next;
        }
        if(carry > 0){
            prev.next = new ListNode(1);
        }
        return temp1;
    }
}