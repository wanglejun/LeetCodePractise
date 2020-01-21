package com.wang.datastructure.linklist

/**
 * Created by wanglejun on 20-1-20.
 */
data class Node<T> constructor(var data: T, var next: Node<T>?) {
    constructor(data: T) : this(data, null)

    fun getNodeData(): T {
        return data
    }

    fun getNodeNext(): Node<T>? {
        return next
    }

    fun setNextNode(next: Node<T>?) {
        this.next = next
    }
}