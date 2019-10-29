package com.leslee.algo4.bases;

import java.util.Iterator;

/**
 * @author: Leslee
 * @create: 2019-10-30 00:02
 **/
public class StackByLinkedListReview<Item> implements Iterable<Item> {
    //先定义链表的节点类
    private class Node{
        Item item;
        Node next;
    }
    private Node first;
    private int N;
    //isEmpty
    public boolean isEmpty(){
        return first == null;
    }
    public int size(){
        return N;
    }
    public void push(Item item){
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }
    //因为是LIFO数据结构，所以是从栈顶删除元素
    public Item pop(){
        Item item = first.item;
        first = first.next;//只需要让first指向first.next就行
        N--;
        return item;

    }

    public Iterator<Item> iterator() {
        return new ListIterator();
    }
    private class ListIterator implements Iterator<Item>{
        private Node currentNode = first;
        //hasNext
        public boolean hasNext(){
            return currentNode!=null;
        }
        public void remove(){}
        public Item next(){
            Item item = first.item;//每次遍历取值就是first.item的取值，但是需要把当前节点的指针不断后移
            currentNode = currentNode.next;
            return item;
        }
    }
}
