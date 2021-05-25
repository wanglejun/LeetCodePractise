package com.wang.leetcode.easy;

import java.util.List;

/**
 * @Description:链表的中间结点
 * @Author: wanglejun
 * @CreateDate： 5/25/21 11:41 PM
 */
class MiddleNode {
    public ListNode middleNode(ListNode head) {
        //遍历计算链表长度
        int length = 0;
        ListNode curr = head;
        while (curr!=null){
            length ++;
            curr = curr.next;
        }

        if(length == 0){
            return null;
        }

        //计算链表中间节点位置
        int middleIndex = length/2;
        for (int i = 0; i <= middleIndex; i++) {
            head = head.next;
        }
        return head;
    }

    //官方题解，快慢指针解法
    public ListNode middleNode2(ListNode head) {
        ListNode fast = head,slow = head;
        //慢指针每次走一步，快指针每次走两步，当快指针走到尾节点时，慢指针恰好在中间节点
        while (fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
