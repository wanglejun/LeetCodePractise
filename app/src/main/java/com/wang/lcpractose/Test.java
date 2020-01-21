package com.wang.lcpractose;

import com.wang.datastructure.linklist.LinkList;

import java.util.LinkedList;

/**
 * Created by wanglejun on 20-1-20.
 */
public class Test {
    public static void main(String[] args) {
        LinkList<Integer> linkList = new LinkList();
        linkList.addFrist(1);
        linkList.addFrist(2);
        linkList.addLast(3);
        linkList.insertOfIndex(4,1);
        System.out.println("linklist====="+linkList.toString());
        linkList.removeOfIndex(2);
//        LinkedList linkList = new LinkedList();
//        linkedList.addFirst(1);
//        linkedList.addFirst(2);
        System.out.println("linklist====="+linkList.toString());
    }
}
