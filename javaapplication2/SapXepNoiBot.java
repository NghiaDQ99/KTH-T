/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coban;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Nghĩa
 */
public class SapXepNoiBot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt(), a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = in.nextInt();
            }
            noiBot(a,n);
        }
    }
    public static void noiBot(int a[], int n) {
        int i, j;
        boolean done;
        ArrayList<String> ds = new ArrayList<>();
        for(i = 0; i < n; i++){
            done = true;
            for(j = 0; j < n-i-1; j++){
                if(a[j] > a[j+1]){
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                    done = false;
                }
            }
            if(done) break;
            String kq = "Buoc" + (i+1) + ":";
            for(j = 0; j < n; j++){
                kq = kq + " " + a[j];
            }
            ds.add(kq);
        }
        Collections.reverse(ds);
        for(String tmp : ds){
            System.out.println(tmp);
        }
    }
}
