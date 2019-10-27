package com.leslee.algo4.service;

import edu.princeton.cs.algs4.StdOut;

import java.lang.reflect.Constructor;

/**
 * @author: Leslee
 * @create: 2019-03-25 23:26
 **/
//一个排序模板
public class Primarysort {
    public static void sort(Comparable[] a){

    }
    public static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }
    public static void exch(Comparable[] a,int i,int j){
        Comparable t = a[i];a[i]=a[j];a[j]=t;
    }
    private static void show(Comparable[] a){
        for (int i=0;i<a.length;i++){
            StdOut.print(a[i]+" ");
        }
        StdOut.print();
    }
    public static boolean isSorted(Comparable[] a){
        for (int i=1;i<a.length;i++){
            if (less(a[i],a[i-1])){
                return false;
            }
        }
        return true;
    }
}
