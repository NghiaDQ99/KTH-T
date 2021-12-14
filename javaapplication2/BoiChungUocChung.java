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
public class BoiChungUocChung {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int a = in.nextInt(), b = in.nextInt();
            int x = usc(a,b);
            System.out.println((long)a*b/x + " " + x);
        }
    }
    public static int usc(int a, int b){
        while(b>0){
            int t = a%b;
            a = b; b = t;
        }
        return a;
    }
}
