// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
     ListNode t = head;
        int count = 0;
        while(t != null){
            count++;
            t = t.next;
        }
        int s = count - n;
        t = head;
        if(s == 0){
            return head.next;
        }else{
        int i =0;
        while(i < s-1){
            i++;
            t = t.next;
        }
        t.next = t.next.next;
    }
        return head;
}
}
// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         ListNode t=head;
//         int count =0;
//         while(t!=null)
//         {
//             count++;
//             t=t.next;
//         }
//         int s=count-n;
//         t=head;
//         if(s==0)
//         {
//             return head.next;
//         }
//         else{
//             int i=0;
//             while(i<s-1)
//             {
//                 t=t.next;
//                 i++;
//             }
//             t.next=t.next.next;
            
//         }
//         return head;
//     }
// }