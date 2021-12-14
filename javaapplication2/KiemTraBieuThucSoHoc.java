/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Nghĩa
 */
public class KiemTraBieuThucSoHoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String str = sc.nextLine();
            boolean check = false;
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == ')'){
                    check = true;
                    char top = stack.peek();
                    stack.pop();
                    while(top != '('){
                        if(top == '+' || top == '-' || top == '*' || top == '/'){
                            check = false;
                        }
                        top = stack.peek();
                        stack.pop();
                    }
                    if (check) break;
                }
                else stack.push(str.charAt(i));
            }
            if(check){
                System.out.print("Yes");
            }
            else{
                System.out.print("No");
            }
            System.out.println();
        }
    }
}
