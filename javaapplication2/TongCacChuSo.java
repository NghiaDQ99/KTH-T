/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coban;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Nghĩa
 */
public class TongCacChuSo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            char[] s = in.next().toCharArray();
            Arrays.sort(s);
            int tong = 0;
            for(int i = 0; i < s.length; i++){
                if(Character.isDigit(s[i]))
                    tong += Character.getNumericValue(s[i]);
                else System.out.print(s[i]);
            }
            System.out.println(tong);
        }
    }
}
