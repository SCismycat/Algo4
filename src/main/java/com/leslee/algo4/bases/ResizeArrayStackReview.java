package com.leslee.algo4.bases;

import org.omg.CORBA.Object;

import java.util.Iterator;

/**
 * @author: Leslee
 * @create: 2019-10-29 23:44
 **/
//增加泛型和继承iterable
public class ResizeArrayStackReview<Item> implements Iterable<Item>{
    //不能直接new Item，因此Obj强转
    private Item[] a = (Item[]) new Object[1];
    private int N = 0;
    //判断是空
    public boolean isEmpty(){
        return N ==0;
    }
    //长度大小
    public int size(){
        return N;
    }
    //扩容
    private void resize(int max){
        Item[] temp = (Item[]) new Object[max];
        for (int i=0;i<N;i++){
            temp[i] = a[i];
        }
        //整个数组赋值过去
        a = temp;
    }
    //把元素加到栈顶
    public void push(Item item){
        //先判断是否需要扩容
        if (N==a.length){
            resize(2*a.length);
        }
        a[N++] = item;
    }

    public Item pop(){
        //栈顶删除元素
        Item item = a[N--];
        a[N] = null;//防止对象游离
        if(N>0 && N==a.length/4){
            resize(a.length/2);
        }
        return item;
    }
    public Iterator<Item> iterator() {
        return new reverseIterator();
    }
    private class reverseIterator implements Iterator<Item>{
        private int i = N;
        public boolean hasNext(){
            return i>0;
        }
        public Item next(){
            return a[--i];
        }
        public void remove(){}
    }
}
