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
public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        while(a-->0){
            int n = in.nextInt();
            if(kiemTra(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static boolean kiemTra(int n){
        if(n<2) return false;
        for(int i = 2; i<= Math.sqrt(n); i++){
            if(n%i == 0) return false;
        }
        return true;
    }
}
