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
    public ListNode reverseList(ListNode head) {

        //check if the linked list is empty then return null
        if(head == null)
            return head;

        ListNode prev = null;
        ListNode next = head.next;

        //reversing the direction of linked list for each node by using prev and next
        while(head.next != null){
            head.next = prev;
            prev = head;
            head = next;
            next = head.next;
        }
        head.next = prev;

        //returning head
        return head;
    }
}