/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wanchana.chapter6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author wanchana
 */
public class WebReader {

    private String url;

    public WebReader(String url) {
        this.url = url;
    }

    public String getHtml() throws IOException {

        InputStream inputStream = null;
        Reader reader = null;
        BufferedReader bf = null;
        //String html = "";
        StringBuilder builder = new StringBuilder(); //clt. R rename
        
        try {

            URL urlObject = new URL(url); //class that recieves url to be stream 
            inputStream = urlObject.openStream();
            reader = new InputStreamReader(inputStream);  // read only one character.
            //So Using BuffedReader.
            bf = new BufferedReader(reader);
            String data;
            
            while((data = bf.readLine()) != null){
               // builder = builder + data;
                builder.append(data); // change + be append
            }

        } finally {
            // attemption.
            if (bf != null){
                bf.close();
            } 
            if (reader != null) {
                reader.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }

        }
        //return html
        return builder.toString();
    }
    
    
    //Using Regular Expression
    
    public Set<String> getLinks() throws IOException{ // return links set
        
        String pattern = "^(https?|//)(://)?[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
        Pattern complied = Pattern.compile(pattern);
        Matcher matcher = complied.matcher(getHtml());
        
        while(matcher.find()){
            System.out.println("link = " + matcher.group(1)); /* group(1) mean
            return value that it finded in 1 group was defined String pattern in line 74*/
        }
        return null;        
    }
}
