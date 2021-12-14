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
public class SapXepChon {
    static int n;
    static int[] arr = new int[105];
    
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if(arr[min] > arr[j]) min = j;
            }
            swap(arr, i, min);
            String res = "";
            res = "Buoc " + String.valueOf(i + 1) + ": ";
            for (int k = 0; k < n; k++) {
                res += String.valueOf(arr[k]) + " ";
            }
            System.out.println(res.trim());
        }
    }
}
