package com.leslee.algo4.bases;

import java.util.Iterator;

/**
 * @author: Leslee
 * @create: 2019-10-27 22:33
 * 实现背包数据结构
 **/
public class Bag<Item> implements Iterable<Item> {

    private Node first;
    private class Node{
        Item item;
        Node next;
    }
    public void add(Item item){
        Node oldNode = first;
        first = new Node();
        first.item = item;
        first.next = oldNode;
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
