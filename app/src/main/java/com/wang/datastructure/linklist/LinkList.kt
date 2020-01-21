package com.wang.datastructure.linklist

import java.lang.IllegalArgumentException

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
            newNode.setNextNode(head)
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
          insertOfIndex(data,length-1)
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
        while (count < length - 1) {
            preNode = preNode!!.next
            count++
        }

        var curNode = preNode!!.next
        preNode.setNextNode(curNode!!)
        length--
    }

    //在指定位置插入节点
    fun insertOfIndex(data: T, index: Int) {

        if (head == null) {
            addFrist(data)
            return
        }

        if (index > length || index < 0) {
            throw IllegalArgumentException("illegal parameter index")
        }

        if (index == 0) {
            addFrist(data)
            return
        }

        var preNode = head!!.next
        var count = 0
        //获取插入位置上一个节点
        while (count < index - 1) {
            preNode = preNode!!.next
            count++
        }

        var newNode = Node(data)
        //新节点指针指向其上一个元素的指针
        newNode.setNextNode(preNode!!.next)
        //更新上一个元素指针为新节点
        preNode.setNextNode(newNode)
        length++

    }

    //删除指定节点
    fun removeOfIndex(index: Int) {
        if (head == null) {
            return
        }

        if (index > length || index < 0) {
            throw IllegalArgumentException("illegal parameter index")
        }

        if (index == 0) {
            removeFrist()
            return
        }

        if (index == length - 1) {
            removeLast()
            return
        }

        var preNode = head!!.next
        var count = 0
        //获取要删除节点的上一个节点
        while (count < index - 1) {
            preNode = preNode!!.next
            count++
        }

        //当前要删除的节点
        var curNode = preNode!!.next
        //更新上一个节点指针直接指向当前要删除节点的指针
        preNode.setNextNode(curNode!!.next)
        length--
    }

    //获取指定位置节点
    fun getDataOfIndex(index: Int): Node<T>? {
        if (head == null) {
            return null
        }

        if (index > length || index < 0) {
            throw IllegalArgumentException("illegal parameter index")
        }

        var curNode = head
        var count = 0
        while (count != index) {
            curNode = curNode!!.next
            count++
        }

        return curNode
    }

    //修改指定节点数据
    fun updateDataOfIndex(data: T, index: Int) {
        if (head == null) {
            return
        }

        if (index > length || index < 0) {
            throw IllegalArgumentException("illegal parameter index")
        }

        if (index == 0) {
            head!!.data = data
            return
        }

        var curNode = head
        var count = 0
        while (count != index) {
            curNode = curNode!!.next
            count++
        }

        curNode!!.data = data
    }

    override fun toString(): String {
        if (head == null) {
            return "[]"
        }
        var sb = StringBuffer()
        sb.append("[")
        var curNode = head
        while (curNode != null) {
            sb.append("${curNode.data} ,")
            curNode = curNode.next
        }
        sb = StringBuffer(sb.substring(0,sb.lastIndexOf(",")))
        sb.append("]")
        return sb.toString()
    }
}