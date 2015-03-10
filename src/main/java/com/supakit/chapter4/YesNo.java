/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supakit.chapter4;

/**
 *
 * @author wanchana
 */
public enum YesNo {
    
    YES(1), NO(0);
    
    private int Score;

    private YesNo(int Score) {
        this.Score = Score;
    }

    public int getScore() { //this construct make it know value of 'YES' and 'NO'
        return Score;
    }
    
}
