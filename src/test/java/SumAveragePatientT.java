/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.wanchana.chapter4.IP;
import com.wanchana.chapter4.OP;
import com.wanchana.chapter4.YesNo;
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
public class SumAveragePatientT {

    private int sum(IP ip){
        
        return ip.getRole1().getScore()
                + ip.getRole2().getScore()
                + ip.getRole3().getScore()
                + ip.getRole4().getScore()
                + ip.getRole5().getScore();
    }
    
    @Test
    public void Sum1Test() {
        
        IP ip = new IP();
        
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.NO);
        ip.setRole4(YesNo.NO);
        ip.setRole5(YesNo.YES);
        
        assertEquals(3, sum(ip)); //result(output), value(input)
                                  //click right and choose Test File
    }
    
    @Test
    public void Sum2Test() {
        
        IP ip = new IP();
        
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.YES);
        ip.setRole4(YesNo.YES);
        ip.setRole5(YesNo.YES);
        
        assertEquals(5, sum(ip)); 
    }
    
    @Test
    public void Sum3Test() {
        
        OP op = new OP();
        
        op.setRole1(YesNo.YES);
        op.setRole2(YesNo.YES);
        op.setRole3(YesNo.YES);
        op.setRole4(YesNo.YES);
        op.setRole5(YesNo.YES);
        op.setRole6(YesNo.YES);
        op.setRole7(YesNo.YES);
        
        assertEquals(5, sum(op)); 
    }

    private Object sum(OP op) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
