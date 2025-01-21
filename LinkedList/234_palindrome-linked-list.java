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
    public ListNode reverseLinkedList(ListNode head,ListNode last){
        ListNode prev = null;
        ListNode next = head.next;
        while(head != last){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        if(head == null || head.next == null){
            return true;
        }
        while(fast!= null && fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode head2 = reverseLinkedList(head,slow);
        if(fast != null){
            slow = slow.next;
        }
        while(head2 != null){
            if(slow.val != head2.val){
                return false;
            }
            slow = slow.next;
            head2 = head2.next;
        }
        return true;
    }
}