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
public class SeparateString {
    public static void main(String[] args) {
        String concade = "",number = "";
        
        
        String str,last3;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Sting : ");
        str = scan.nextLine();
        System.out.println("Length = " +str.length());
        
        //Answer
        String input = "wanchana-kunkhum-1993";
        String split[] = input.split("-");
        System.out.println(split[0] + " ," + split[1] + " ," +split[2]);
        //28th Dec 2014
        last3 = str.substring(str.length()-3,str.length());
        System.out.println("The last 3 char : " + last3);
        
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(Character.isDigit(c)){
                number = number+c;
            }
            else{
                concade = concade+c;
            }
        }
        System.out.println("String = "+concade);
        System.out.println("Number = "+number);
    }
}
