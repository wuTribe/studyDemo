package com.leetcode.q160.w2;


import com.leetcode.q160.base.ListNode;

public class Solution {
    /*  走对方的路 */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode headATemp = headA;
        ListNode headBTemp = headB;
        while (headATemp != headBTemp) {
            headATemp = headATemp.next;
            headBTemp = headBTemp.next;
            if (headATemp == null && headBTemp == null) {
                break;
            }
            if (headATemp == null) {
                headATemp = headB;
            }
            if (headBTemp == null) {
                headBTemp = headA;
            }
        }

        return headATemp;
    }

}