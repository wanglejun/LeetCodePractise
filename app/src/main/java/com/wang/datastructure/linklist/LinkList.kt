package com.wang.datastructure.linklist

/**
 * Created by wanglejun on 20-1-20.
 */
class LinkList<T> {
    //头节点
    private var head: Node<T>? = null
    //链表长度
     var length: Int = 0

    //添加头节点
    fun addFrist(data: T) {
        var newNode = Node(data)
        if (head == null) {
            head = newNode
        } else {
            //新的头节点指针直接指向老的头节点
            newNode.next = head
            //更新头节点为新头节点
            head = newNode
        }
        length++
    }

    //删除头节点
    fun removeFrist() {
        if (head == null) {
            return
        }
        //声明哨兵节点
        var curNode = head
        //更新头节点为哨兵节点指向下个节点的引用 即完成了头节点删除
        head = curNode
        length--
    }

    //添加尾节点
    fun addLast(data: T) {
        var newNode = Node(data)
        if (head == null) {
            head = newNode
        } else {
            //遍历找到最后一个节点
            var preNode = head
            var count = 1
            while (count < length) {
                //更新最后一个节点
                preNode = preNode!!.next
                count++
            }
            //最后节点指针指向已查找的最后节点指针 null
            var curNode = preNode!!.next
            //新节点指针指向最后节点指针
            newNode.setNextNode(curNode)
            //原最后节点指针更新为新最后节点指针
            preNode.setNextNode(newNode)
        }
        length++
    }

    //删除尾节点
    fun removeLast() {
        if (length == 0) {
            return
        }
        var preNode = head
        var count = 1
        while (count < length-1) {
            preNode = preNode!!.next
            count++
        }

        var curNode = preNode!!.next
        preNode.setNextNode(curNode!!)
        length--
    }

    //在指定位置插入节点
    fun insertOfIndex(data: T, index: Int) {

    }

    //删除指定节点
    fun removeOfIndex(index: Int) {

    }

    //获取指定位置节点
    fun getDataOfIndex(index: Int): Node<T>? {
        return null
    }

    //修改指定节点数据
    fun updateDataOfIndex(index: Int) {

    }

}