package com.wang.leetcode.easy;

/**
 * @Description:移除链表元素
 * @Author: wanglejun
 * @CreateDate： 5/24/21 11:51 PM
 */
class RemoveElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = null;
        ListNode curr = head;
        //遍历查找目标节点
        while (curr!=null){
            if (curr.val == val){
                //要删除的节点是头节点
                if (prev == null){
                    prev = curr.next;
                }else{
                    prev.next = prev.next.next;
                }
            }else{
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }

    //使用虚拟节点，简化头节点处理
    public ListNode removeElements2(ListNode head, int val) {
        ListNode virtual = new ListNode();
        virtual.next = head;

        ListNode prev = virtual;
        ListNode curr = head;
        //遍历查找目标节点
        while (curr!=null){
            if (curr.val == val){
                prev.next = prev.next.next;
            }else{
                prev = curr;
            }
            curr = curr.next;
        }
        return virtual.next;
    }
}
