/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dequi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Nghĩa
 */
public class LietKeTapCon {
    static int n = 0, b[] = new int[30];
    static String s = "";
    static ArrayList<String> kq = new ArrayList<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            kq = new ArrayList<>();
            n = in.nextInt();
            s = in.next();
            quayLui(1);
            Collections.sort(kq);
            for(String s:kq)
                System.out.print(s + " ");
            System.out.println();
        }
    }
    public static void quayLui(int i) {
        for(int j = 0; j <= 1; j++){
            b[i] = j;
            if(i == n)
                xuLy();
            else quayLui(i+1);
        }
    }
    public static void xuLy() {
        StringBuilder tapcon = new StringBuilder();
        for(int i = 1; i <= n; i++){
            if(b[i] == 1)
                tapcon.append(s.charAt(i-1));
        }
        kq.add(tapcon.toString());
    }
}
