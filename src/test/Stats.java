/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 *
 * @author mayb
 */
public class Stats {
    public static void main(String[] args) {
        Bag<Double> numbers = new Bag<Double>();
        while(!StdIn.isEmpty()){
          
            numbers.add(StdIn.readDouble());
        }
        int N = numbers.size();
        double sum = 0.0;
        for(double x:numbers){
        	sum = sum + x;
        }
        double mean = sum/N;
        StdOut.printf("平均数是:%.2f\n", mean);
    }
}

