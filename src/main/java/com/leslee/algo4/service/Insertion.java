package com.leslee.algo4.service;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author: Leslee
 * @create: 2019-03-26 23:31
 **/
public class Insertion {

    public static void sort(Comparable[] a){
        int N = a.length;
        for (int i=1;i<N;i++){
            for(int j=i;j>0 && less(a[j],a[j-1]);j--){
                exch(a,j,j-1);
            }
        }
    }

    public static boolean less(Comparable v, Comparable w){
        return v.compareTo(w)<0;
    }
    public static void exch(Comparable[] a,int i,int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    private static void show(Comparable[] a){
        for(int i=0;i<a.length;i++){
            StdOut.print(a[i]+" ");
        }
        StdOut.print();
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"1","2","5","4","3"};
        sort(strs);
        show(strs);
    }
}
