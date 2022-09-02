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
        if(head == null){
            return head;
        }
        
        ListNode previos = null;
        ListNode present = head;
        ListNode next = head.next;
        
        while(present != null){
            present.next = previos;
            previos = present;
            present = next;
            if(next!=null){
                next = next.next;
            }
        }
        return previos;
    }
}