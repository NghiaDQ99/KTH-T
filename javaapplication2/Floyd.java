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
public class Floyd {
    static int n,m,u,v,w;
    static int [][] a = new int [105][105];  
//    static int [][] d = new int [1005][1005];  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j; 
        n = sc.nextInt(); 
        m = sc.nextInt();
        for(i=0; i<=n; i++){
            for(j = 0; j<=n; j++){
                a[i][j] = (int)1e9;
            }
        }
        for(i = 1; i<=m; i++){
            u = sc.nextInt(); v = sc.nextInt(); w = sc.nextInt();
            a[u][v] = w;
            a[v][u] = w;
        }
        floyd();
        int q = sc.nextInt();
        while(q-->0){
            u = sc.nextInt(); v = sc.nextInt();
            System.out.println(a[u][v]);
        }
    }
    public static void floyd(){
        int i,j,k;
        for(k=1; k<=n; k++){
            for(i=1; i<=n; i++){
                for(j=1; j<=n; j++){
                    if(a[i][j] > a[i][k] + a[k][j]){
                        a[i][j] = a[i][k] + a[k][j];                    
                    }
                }
            }
        }
    }
}
