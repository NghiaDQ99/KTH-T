/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Nghĩa
 */
public class BienDoiST {
    static int[] a = new int[100];
    static int n;
    static boolean[] check = new boolean[100];

    static void solve(int i){
        for (int j = n; j > 0; j--) {
            if(!check[j]){
                a[i] = j;
                check[j] = true;
                if(i == n){
                    for (int k = 1; k <= n; k++) {
                        System.out.print(a[k]);
                    }
                    System.out.print(" ");
                }
                else solve(i + 1);
                check[j] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            solve(1);
            System.out.println();
        }
    }
}
