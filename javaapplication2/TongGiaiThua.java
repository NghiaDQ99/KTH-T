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
public class TongGiaiThua {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long s = 0, t = 1;
        for(int i=1; i<=n; i++){
            t *= i;
            s += t;
        }
        System.out.println(s);
    }
}
