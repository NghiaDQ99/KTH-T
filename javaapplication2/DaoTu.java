/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Nghĩa
 */
public class DaoTu {
    static String reverse(String str){
        StringBuilder s = new StringBuilder(str);
        return new String(s.reverse());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String str = sc.nextLine();
            String[] arr = str.trim().split("\\s");
            String res = "";
            for(String s1 : arr){
                res += reverse(s1) + " ";
            }
            System.out.println(res.trim());
        }
    }
}
