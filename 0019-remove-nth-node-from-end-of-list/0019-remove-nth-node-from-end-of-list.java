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
        ListNode temp = head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp = head;
        int c=0;
        if(count-n==0){
            head=head.next;
            return head;    
        }else{
            while(temp!=null){
                c++;
                if(c==count-n){
                    temp.next = temp.next.next;
                }
                temp=temp.next;
            }
        }
        return head;
    }
}