package com.leslee.algo4.test.bases;

import com.leslee.algo4.bases.FixedCapacityStackOfStrings;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import sun.plugin2.main.server.WindowsHelper;

/**
 * @author: Leslee
 * @create: 2019-10-27 23:01
 **/
public class TestFixedCapacityStackOfStrings {
    public static void main(String[] args) {
        FixedCapacityStackOfStrings<String> s;
        s = new FixedCapacityStackOfStrings<String>(100);
        while (!StdIn.isEmpty()){
            String item = StdIn.readString();
            if (!item.equals("-")){
                s.push(item);
            }
            else if(!s.isEmpty()){
                StdOut.print(s.pop()+" ");
            }
        }
        StdOut.println("<"+s.size()+"left on stack)");
    }
}
