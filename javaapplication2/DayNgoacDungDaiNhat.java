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
public class DayNgoacDungDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String str = sc.next();
            Stack<Integer> stack = new Stack<>();
            int res = 0;
            stack.push(-1);
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == '('){
                    stack.push(i);
                }
                else{
                    stack.pop();
                    if(stack.size() > 0){
                        res = Math.max(res, i - stack.peek());
                    }
                    if(stack.size() == 0) stack.push(i);
                }
            }
            System.out.println(res);
        }
    }
}
