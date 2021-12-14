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
public class LuyThua {
    static int mod = (int) (1e9+7);
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt(), k = in.nextInt();
            System.out.println(powMod(n,k));
        }
    }
    public static long powMod(int n, int k){
        if(k == 0)
            return 1;
        long x = powMod(n, k/2);
        if(k%2 == 0)
            return x*x%mod;
        return n*(x*x%mod)%mod;
    }
}
