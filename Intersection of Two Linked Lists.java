/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1=0,l2=0;
        ListNode p1=headA;
        ListNode p2=headB;
        if(p1==null || p2==null)
        {
            return null;
        }
        while(p1!=null){
            l1++;
            p1=p1.next;
        }
        while(p2!=null){
            l2++;
            p2=p2.next;
        }
        int d=0;
        p1=headA;
        p2=headB;
        if(l1>l2){
            d=l1-l2;
            int i=0;
            while(i<d){
                p1=p1.next;
                i++;
            }
        }
        if(l2>l1){
            d=l2-l1;
            int i=0;
            while(i<d){
                p2=p2.next;
                i++;
            }
        }
        while(p1!=null && p1!=null)
        {
            if(p1==p2)
                return p1;
            p1=p1.next;
            p2=p2.next;
        }
        return null;
    }
}