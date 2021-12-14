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
public class DayConLapLaiDaiNhat {
    static int c[][];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            char s[] = in.next().toCharArray();
            System.out.println(qhd(s,n));
        }
    }
    public static int qhd(char s[], int n){        
        c = new int[n+1][n+1];
        for (int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(s[i-1] == s[j-1] && i != j) c[i][j] = c[i-1][j-1] + 1;
                else c[i][j] = Math.max(c[i-1][j], c[i][j-1]);
            }
        }
        return c[n][n];
    }
}
