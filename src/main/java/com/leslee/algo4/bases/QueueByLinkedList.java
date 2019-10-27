package com.leslee.algo4.bases;

import java.util.Iterator;

/**
 * @author: Leslee
 * @create: 2019-10-28 00:10
 * 该实现将队列表示为从最早插入的元素到最近插入的元素的链表，其中first变量指向队列开头，last指向结尾，元素入列即添加到最后，如果链表是空，需要分别对
 * first和last指向新节点，如果是出列，删除表头的节点，指针后移。
 **/
public class QueueByLinkedList<Item> implements Iterable<Item> {

    private Node first;
    private Node last;
    private int N;
    private class Node{
        Item item;
        Node next;
    }
    //null
    public boolean isEmpty(){
        return N==0;
    }
    public int size(){
        return N;
    }
    public void enqueue(Item item){
        //向表尾添加元素
        Node oldlast = last;
        last = new Node();
        last.item = item;//先给新节点赋值；
        last.next = null;//最后一个是空
        //防止空链表，判断一下
        if (isEmpty()){
            first = last;
        }else {
            oldlast.next = last;
        }
        N ++;
    }

    public Item dequeue(){
        //从表头删除元素
        Item item  = first.item;
        first = first.next;
        if (isEmpty()){
            last = null;
        }
        N --;
        return item;
    }



    public Iterator<Item> iterator() {
        return new ListIterator();
    }
    private class ListIterator implements Iterator<Item> {
        private Node currentNode = first;

        public boolean hasNext() {
            return currentNode != null;
        }

        public void remove() {
        }

        public Item next() {
            Item item = currentNode.item;//选择要返回的元素
            currentNode = currentNode.next;//指针往后移动；
            return item;
        }
    }
}
