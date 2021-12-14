/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coban;

import java.util.Scanner;

/**
 *
 * @author Nghĩa
 */
public class MangDoiXung {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt(), a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = in.nextInt();
            }
            if(doiXung(a,n))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static boolean doiXung(int a[], int n){
        int d = 0, c = n - 1;
        while(d<c){
            if(a[d] != a[c])
                return false;
            d++; c--;
        }
        return true;
    }
}
