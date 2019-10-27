package com.leslee.algo4.service;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author: Leslee
 * @create: 2019-03-25 23:44
 **/
public class Selection {

//    选择排序算法
    public static void sort(Comparable[] a){
        int N = a.length;
        for(int i =0;i<N;i++){
            int min = i;
            for (int j = i+1;j<N;j++){
                if (less(a[j],a[min])){
                    min = j;
                    exch(a,i,min);
                }
            }
        }
    }

    //比较v跟w，如果v<w则返回true
    public static boolean less(Comparable v,Comparable w){
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
