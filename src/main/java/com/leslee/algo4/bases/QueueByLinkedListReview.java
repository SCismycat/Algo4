package com.leslee.algo4.bases;

import java.util.Iterator;

/**
 * @author: Leslee
 * @create: 2019-10-30 00:13
 **/
public class QueueByLinkedListReview<Item> implements Iterable<Item> {


    private class Node{
        Item item;
        Node next;
    }
    private Node first;
    private Node last;
    private int N;
    //isEmpty
    public boolean isEmpty(){
        return N ==0;
    }
    // size
    public int size(){
        return N;
    }
    public void enqueue(Item item){
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()){
            first = last;
        }else {
            oldLast.next = last;
        }
        N ++;
    }
    public Item dequeue(){
        Item item = first.item;
        first = first.next;
        if (isEmpty()){
            last = null;
        }
        N--;
        return item;
    }


    public Iterator<Item> iterator() {
        return null;
    }
}
