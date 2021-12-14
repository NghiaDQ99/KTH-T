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
public class ToHop {
    static int c[][] = new int[1005][1005], mod = (int)1e9 + 7;
    public static void main(String[] args) {
        for(int i=0; i<=1000; i++){
            for(int j=0; j<=i; j++){
                if(i==j || j==0)
                    c[i][j] = 1;
                else c[i][j] = (c[i-1][j-1] + c[i-1][j]) % mod;
            }
        }
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt(), k = in.nextInt();
            System.out.println(c[n][k]);
        }
    }
}
