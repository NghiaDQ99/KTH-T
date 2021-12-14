/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author Nghĩa
 */
public class NoiDay {
    static long mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            PriorityQueue<Long> a = new PriorityQueue<>();
            long val;
            for (int i = 0; i < n; i++) {
                val = sc.nextLong();
                a.add(val);
            }
            long res = 0;
            while(a.size() > 1){
                long x = a.poll();
                long y = a.poll();
                long temp = (x + y) % mod;
                a.add(temp);;
                res += temp;
                res %= mod;
            }
            System.out.println(res);
        }
    }
}
