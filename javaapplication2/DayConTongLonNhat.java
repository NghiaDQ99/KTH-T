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
public class DayConTongLonNhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt(), a[] = new int[n];
            for(int i=0; i<n; i++) a[i] = in.nextInt();
            System.out.println(qhd(a,n));
        }        
    }
    public static int qhd(int a[], int n){
        int f[] = new int[n], i, j, kq = 0;
        for(i=0; i<n; i++){
            f[i] = a[i];
            for(j=0; j<i; j++){
                if(a[j] < a[i]){
                    f[i] = Math.max(f[i], f[j]+a[i]);
                }
            }
            kq = Math.max(kq, f[i]);
        }
        return kq;
    }
}
