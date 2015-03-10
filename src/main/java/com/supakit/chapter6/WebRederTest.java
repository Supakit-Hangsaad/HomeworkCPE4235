/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supakit.chapter6;

import java.io.IOException;
import java.util.Set;

/**
 *
 * @author wanchana
 */
public class WebRederTest {
    
    public static void main(String[] args) throws IOException {
        WebReader reader = new WebReader("https://google.com");
        //System.out.println("HTML = " + reader.getHtml());
        //System.out.println("link = " + reader.getLinks());
        Set<String> links = reader.getLinks();
        for(String link : links){
            System.out.println("link = " + link);
        }
    }
}
