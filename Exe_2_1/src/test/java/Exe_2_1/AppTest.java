package Exe_2_1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTest 
{
	App check = new App();

    @Test
    public void Min_Check() {
    	int Grade = 50;
    	String expected = "E";
    	String result = App.BVA_Check(Grade);
        assertEquals(expected, result);
    }
    @Test
    public void Min_Check_PlusOne(){
    	int Grade = 51;
    	String expected = "E";
    	String result = App.BVA_Check(Grade);
    	assertEquals(expected,result);
    }
    @Test
    public void Nominal_check(){
    	int Grade = 55;
    	String expected = "E";
    	String result = App.BVA_Check(Grade);
    	assertEquals(expected,result);
    }
    @Test
    public void Max_Check(){
    	int Grade = 59;
    	String expected = "E";
    	String result = App.BVA_Check(Grade);
    	assertEquals(expected,result);
    }
    @Test
    public void Max_Check_MinusOne(){
    	int Grade = 58;
    	String expected = "E";
    	String result = App.BVA_Check(Grade);
    	assertEquals(expected,result);
    }
}
