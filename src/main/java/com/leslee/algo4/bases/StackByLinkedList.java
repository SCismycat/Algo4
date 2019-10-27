package com.leslee.algo4.bases;

import java.util.Iterator;

/**
 * @author: Leslee
 * @create: 2019-10-27 23:53
 * Stack based on linkedList
 **/
public class StackByLinkedList<Item> implements Iterable<Item> {

    private Node first;//stack top ,（最近添加的元素)
    private int N;//元素数量
    //定义节点的嵌套类
    private class Node{
        Item item;
        Node next;
    }
    public boolean isEmpty(){
        return first == null;
    }
    public int size(){
        return N;
    }

    public void push(Item item){
        //向栈顶添加元素
        Node oldNode = first;
        first = new Node();
        first.item = item;
        first.next = oldNode;
        N++;
    }
    //出栈是后入先出，因此弹出栈顶元素
    public Item pop(){
        Item item = first.item;
        first = first.next;//把原来的第二个，放到第一个
        N--;
        return item;
    }

    public Iterator<Item> iterator() {
        return new ListIterator();
    }
    private class ListIterator implements Iterator<Item>{
        private Node currentNode = first;
        public boolean hasNext(){
            return currentNode != null;
        }
        public Item next(){
            Item item = currentNode.item;//选择要返回的元素
            currentNode = currentNode.next;//指针往后移动；
            return item;
        }
        public void remove(){}
    }
}
