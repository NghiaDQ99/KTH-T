/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quyhoachdong;

import java.util.Scanner;

/**
 *
 * @author Nghĩa
 */
public class CaiTui {
    static int f[][], a[], c[], n, v;
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            n = in.nextInt(); v = in.nextInt();
            a = new int[n+1]; c = new int[n+1];
            f = new int[n+1][v+1];
            for(int i=0; i<n; i++) a[i] = in.nextInt();
            for(int i=0; i<n; i++) c[i] = in.nextInt();
            System.out.println(qhd());
        }
    }
    public static int qhd(){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=v; j++){
                f[i][j] = f[i-1][j];
                if(j >= a[i]){
                    f[i][j] = Math.max(f[i][j], f[i-1][j-a[i]] + c[i]);
                }
            }
        }
        return f[n][v];
    }
}
