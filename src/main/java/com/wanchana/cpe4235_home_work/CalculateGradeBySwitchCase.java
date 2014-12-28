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
public class CalculateGradeBySwitchCase {
    public static void main(String[] args) {
        int score;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter score : ");
        score = scan.nextInt();
        
        switch(score/10){
            case 5:
                System.out.println("You got grede D");
                break;
            case 6:
                System.out.println("You got grade C");
                break;
            case 7:
                System.out.println("You got grade B");
                break;
            case 8:
                System.out.println("You got grade A");
                break;
            case 9:
                System.out.println("You got grade A");
                break;
            case 10:
                System.out.println("You got grade A");
                break;
                
            default:
                System.out.println("You got grade F");
                break;
        }
        
    }
    
}
