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
public class NhamChuSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String min_a = a.replaceAll("6", "5");
        String min_b = b.replaceAll("6", "5");
        String max_a = a.replaceAll("5", "6");
        String max_b = b.replaceAll("5", "6");
        int min = Integer.parseInt(min_a) + Integer.parseInt(min_b);
        int max = Integer.parseInt(max_a) + Integer.parseInt(max_b);
        System.out.println(min + " " + max);
    }
}
