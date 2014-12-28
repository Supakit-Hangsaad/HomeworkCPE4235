/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wanchana.cpe4235_home_work;

import java.util.Scanner;

/**
 *
 * @author wanchana
 */
public class SeparateString_Ans {
    private static boolean is(char ch,char start,char end){
        return (int)start >= (int)ch && (int)ch <= (int)end;
    }
    private static boolean isString(char ch){
        
        return is(ch,'A','Z') || is(ch,'a','z');
    }
    private static boolean isNumber(char ch){
        
        return is(ch,'0','9');
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        System.out.println("Input -> : " + input);
        System.out.println((int)'A');
        
        String str = "";
        String number = "";
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if(isNumber(input.charAt(i))){
                number = number + input.charAt(i);
            }
            if(isString(ch)){
                str = str + ch;
            }
        }
        System.out.println("Number : " + number);
        System.out.println("String : " + str);
    }
}
