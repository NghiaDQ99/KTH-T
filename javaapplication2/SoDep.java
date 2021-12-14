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
public class SoDep {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            String s = in.next();
            if(tn(s) && chan(s))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static boolean tn(String s){
        StringBuilder b = new StringBuilder(s);
        String rv = b.reverse().toString();
        return s.equals(rv);
    }
    public static boolean chan(String s){
        for(int i = 0; i < s.length(); i++){
            int t = s.charAt(i) - '0';
            if(t%2 == 1)
                return false;
        }
        return true;
    }
}
