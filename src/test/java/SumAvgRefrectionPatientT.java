/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.wanchana.chapter4.IP;
import com.wanchana.chapter4.Patient;
import com.wanchana.chapter4.YesNo;
import java.lang.reflect.Method;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wanchana
 */
public class SumAvgRefrectionPatientT {
    
    //  avg = sum/n
    
    private float average(Patient patient) throws Exception{
        
        return (float)sum(patient) / (float)count(patient);
    
    }
    
    private int count(Patient patient) throws Exception{
        
        //Dynamic role by Refrection
        Method[] methods = patient.getClass().getMethods(); //get every method
        
        int count =0;
        for(Method method : methods){
            if(method.getName().startsWith("getRole")){
                count = count + 1;
            }
        }
        return count;     
                
    }
    
    
    private int sum(Patient patient) throws Exception{
        
        //Dynamic role by Refrection
        Method[] methods = patient.getClass().getMethods(); //get every method
        
        int sum =0;
        for(Method method : methods){
            if(method.getName().startsWith("getRole")){
                YesNo yn = (YesNo)method.invoke(patient);//this method must recieves param
                                                    //and dotype casting
                sum = sum + yn.getScore();
            }
        }
        return sum;     
                
    }
    
    @Test
    public void Sum1Test() throws Exception{
        
        IP ip = new IP();
        
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.NO);
        ip.setRole4(YesNo.NO);
        ip.setRole5(YesNo.YES);
        
        assertEquals(3, sum(ip)); //result(output), value(input)
                                  //click right and choose Test File
        assertEquals(0.6, average(ip), 0.05);
    }
    
    @Test
    public void Sum2Test() throws Exception {
        
        IP ip = new IP();
        
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.YES);
        ip.setRole4(YesNo.YES);
        ip.setRole5(YesNo.YES);
        
        assertEquals(5, sum(ip));
        assertEquals(1, average(ip), 0);
    }
}
