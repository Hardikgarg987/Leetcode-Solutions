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
          int count = 0;
          ListNode temp = head;
          while(temp != null){
            count++;
            temp = temp.next;
          }

          n = count - n + 1;
          temp = head;
          if(n == 1){
            return head.next;
          }
          ListNode prev = head;
          for(int i = 1;i<n;i++){
                prev = temp;
                temp = temp.next;
                
          }
          prev.next = temp.next;
        return head;
    }
}