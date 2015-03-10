
package com.supakit.chapter2;


import java.util.Arrays;
import java.util.Scanner;


public class ArraysAndBubleSort {
    public static void main(String[] args) {
        int number[] = new int[5];
        int tmp;
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<5;i++){
            number[i] = (int)(Math.random()*10+1);
            System.out.println("Array[" + i + "] = "+ number[i]);
        }
        System.out.println("============");
        Arrays.sort(number);
        
        System.out.println("Maximum = " + number[number.length - 1]);
        
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(number[j]>number[j+1]){
                    tmp=number[j];
                    number[j]=number[j+1];
                    number[j+1]=tmp;
                }
            }
        }
        System.out.print("Bubble sort : ");
        for(int k=0;k<5;k++){
            System.out.print(number[k] + " ");
        }
        System.out.println();
    }
    
}
