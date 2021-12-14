/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Nghĩa
 */
public class DFSDuongDiVoHuong {
    static ArrayList<Integer>[] ke = new ArrayList[1005];
    static boolean chuaxet[] = new boolean[1005];
    static int [] truoc = new int [1005];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a-->0){
            int n = sc.nextInt(), m = sc.nextInt(), s = sc.nextInt(), t = sc.nextInt();
            for(int i=0; i<=n; i++){
                ke[i] = new ArrayList<>();
                chuaxet[i] = true;
            }
            for(int i=1; i<=m;i++){
                int u = sc.nextInt(), v = sc.nextInt();
                ke[u].add(v);
                ke[v].add(u);
            }
            dfs(s);
            if(chuaxet[t] ) System.out.println("-1");
            else{
                Stack<Integer> st = new Stack<>();
                st.push(t);
                while(st.peek() !=s){
                    int x = st.peek();                  
                    st.push(truoc[x]);
                }
                while(!st.isEmpty()){
                    System.out.print(st.peek() + " ");
                    st.pop();
                }
            }
            System.out.println();
        }
    }
    public static void dfs(int u){
        chuaxet[u] = false;
        for(Integer v : ke[u]){
            if(chuaxet[v]){
                dfs(v);
                truoc[v] = u;
            }
                
        }
    }
}
