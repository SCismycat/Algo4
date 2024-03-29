package com.leslee.algo4.service;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author: Leslee
 * @create: 2019-03-28 00:58
 **/
//希尔排序
public class Shell {
    public static void sort(Comparable[] a){
        int N = a.length;
        int h = 1;
        while (h<N/3){
            h = 3*h+1;
        }
        while (h>=1){
            for(int i=h;i<N;i++){
                for (int j=i;j>h&&less(a[j],a[j-1]);j-=h){
                    exch(a,j,j-h);
                }
            }
        }
        h = h/3;
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
        String[] strs = new String[]{"1","2","5","4","3","3","2","7","5","6"};
        sort(strs);
        show(strs);
    }
}
