package com.nnam.mathutil.core.test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.nnam.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ASUS
 */
public class MathUtilitiTest {
    //Test case #1 : Verifiy Getfactorial (with n=0)
    // step/ prodedures:
    /*
    1. given n =0
    2. call/involke Getfactorial (with n=0)
    expected result:
    the method must be return 1 as the resutl of 0!=1
    status : PASSED | FAILED chờ lúc chạy hàm mới biết trạng thái đúng sai 
    
    
*/
    @Test
    public void verifyFactorialGivenRightArgument0ReturnsOK(){
        assertEquals(1, MathUtility.getFactorial(0));
    }
    
     @Test
    public void verifyFactorialGivenRightArgument1ReturnsOK(){
        assertEquals(1, MathUtility.getFactorial(1));
    }
    
      @Test
    public void verifyFactorialGivenRightArgument5ReturnsOK(){
        assertEquals(120, MathUtility.getFactorial(5));
    }
    //unit test / TDD/ DDT
    // MAVEN / CI / (CD/DevOps)
    // build từ cmd
    // Github
}
