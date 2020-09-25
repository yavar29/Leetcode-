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
        int count=1;
        int mid=0;
        ListNode ans=head;
        while(ans.next!=null){
            ans=ans.next;
            count++;
        }
        mid= count/2 +1;
        
        for(int i=0;i<mid -1;i++){
            head=head.next;
        }
        return head;
        
    }
}