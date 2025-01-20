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
    public ListNode middleNode(ListNode head) {
        //this node will jump to next node
        ListNode next = head;

        //this node will jump to next of next node
        ListNode next2 = head;

        //loop to do so until we reach null 
        while(next2 != null && next2.next != null){
            next = next.next;
            next2 = next2.next.next;
        }

        //after the loop next will reach to the middle of linked list
        return next;
    }
}