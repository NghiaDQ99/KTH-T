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
public class HoanViXauKyTu {
    static int a[] = new int[15], b[] = new int[15], n;
    static String s = "";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            s = in.next();
            n = s.length();
            quayLui(1);
            System.out.println();
        }
    }
    public static void quayLui(int i){
        for(int j=1; j<=n; j++){
            if(b[j]==0){
                a[i] = j; b[j] = 1;
                if(i==n) in();
                else quayLui(i+1);
                b[j] = 0;
            }
        }
    }
    public static void in(){
        for(int i=1; i<=n; i++){
            System.out.print(s.charAt(a[i]-1));
        }
        System.out.print(" ");
    }
}
