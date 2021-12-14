/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Nghĩa
 */
public class DSA09005_BFS {
    static ArrayList<Integer>[] dsKe = new ArrayList[1005];
    static boolean[] chuaxet = new boolean[1005];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(),m = sc.nextInt(), bd = sc.nextInt();
            for (int i = 0; i <= n; i++) {
                dsKe[i] = new ArrayList<>();
                chuaxet[i] = true;
            }
            for (int i = 1; i <= m; i++) {
                int u = sc.nextInt(),v = sc.nextInt();
                dsKe[u].add(v);
                dsKe[v].add(u);
            }
            bfs(bd);
            System.out.println("");
        }
    }
    public static void bfs(int u){
        Queue<Integer> q = new LinkedList<>();
        q.add(u);chuaxet[u] = false;
        while (!q.isEmpty()) {            
            int v = q.poll();
            System.out.print(v + " ");
            for (Integer i : dsKe[v]) {
                if(chuaxet[i]){
                    chuaxet[i] = false;
                    q.add(i);
                }
            }
        }
    }
}
