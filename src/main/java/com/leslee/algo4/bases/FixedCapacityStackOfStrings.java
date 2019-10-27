package com.leslee.algo4.bases;

/**
 * @author: Leslee
 * @create: 2019-10-27 22:51
 * 前驱实例
 **/
public class FixedCapacityStackOfStrings<Item> {
    private Item[] a;
    private int N;
    public FixedCapacityStackOfStrings(int cap){
        a = (Item[]) new Object[cap];
    }
    public Boolean isEmpty(){
        return N == 0;
    }
    public int size(){
        return N;
    }
    public void push(Item item){
        a[N++] = item;
    }
    public Item pop(){
        return a[--N];
    }
}
