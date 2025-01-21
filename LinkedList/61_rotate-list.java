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
    public ListNode rotateRight(ListNode head, int k) {
        int count = 0;
        ListNode temp = head;
        if(head == null || head.next== null){
            return head;
        }
        while(temp != null){
            count++;
            temp = temp.next;
        }
        k = k%count;
        if(k == 0) {
            return head;
        }
        temp = head;
        for(int i = 0;i < count - k - 1; i++){
            temp = temp.next;
        }
        ListNode next = temp.next;
        temp.next = null;
        temp = next;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
        return next;
    }
}