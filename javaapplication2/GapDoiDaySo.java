/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dequi;

import java.util.Scanner;

/**
 *
 * @author Nghĩa
 */
public class GapDoiDaySo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt(), k = in.nextInt();
            System.out.println(tinh(n,k));
        }
    }
    public static long tinh(int n, long k){
        long x = (long) Math.pow(2, n-1);
        if(k == x) 
            return n;
        if(k < x)
            return tinh(n-1,k);
        return tinh(n-1, k-x);
    }
}

