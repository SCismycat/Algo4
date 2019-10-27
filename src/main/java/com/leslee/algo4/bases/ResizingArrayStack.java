package com.leslee.algo4.bases;

import java.util.Iterator;

/**
 * @author: Leslee
 * @create: 2019-10-27 23:14
 * 一种栈的普通实现方式
 **/
public class ResizingArrayStack<Item> implements Iterable<Item> {

    private Item[] a = (Item[]) new Object[1];//init a stack element
    private int N = 0;//the element number
    //一个栈需要具有以下几个方法：
    // size/resize , push , pop , iterator
    private void resize(int max){
        Item[] temp = (Item[]) new Object[max];//不能直接new泛型，因此使用obj对象转
        for(int i = 0;i<N;i++){
            temp[i] = a[i];
        }
        a = temp;
    }

    public void push(Item item){
        //元素加到栈顶
        if (N == a.length){
            resize(2*a.length);
            a[N++] = item;
        }
    }
    public Item pop(){
        //从栈顶删除元素
        Item item = a[--N];
        //java垃圾回收只回收所有无法被访问的对象的内存，但是此处弹出的数组仍然占用内存空间，虽然已经不会被访问了。
        a[N] = null;
        if (N>0 && N ==a.length/4){
            //保证使用率永远不会低于1/4
            resize(a.length/2);
        }
        return item;
    }
    //集合类型必须实现一个iterator方法并且返回一个Iterator对象。
    //Iterator类中必须包含两个方法：hasNext()和next()返回泛型元素
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item>{
        private int i = N;
        public boolean hasNext(){
            return i>0;
        }
        public Item next(){
            return a[--i];
        }
        public void remove(){

        }

    }
}
