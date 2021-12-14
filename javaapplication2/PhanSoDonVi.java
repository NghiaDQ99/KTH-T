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
public class PhanSoDonVi {
    static void printFraction(long P, long Q){
        if(P == 0 || Q == 0){
            return;
        }
        if(Q % P == 0){
            System.out.println("1/" + Q / P);
            return;
        }
        long n = Q / P + 1;
        System.out.print("1/" + n + " + ");
        printFraction(P * n - Q, Q * n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long P = sc.nextLong();
            long Q = sc.nextLong();
            printFraction(P, Q);
        }
    }
}
