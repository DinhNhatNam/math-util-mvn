/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.nnam.mathutil.core.test;

import com.nnam.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author ASUS
 */
public class mathUtilityDDTTest {
 // ta cần chuẩn bị bộ data để cho vafo2 hàm qua tham số
    // kĩ thuật tách data kiểm thử ra khỏi câu lệnh so sánh 
    // để data ở riêng 1 chỗ , từ fill vào hàm 
  // data thường để mảng 2 chiều 
    /*
    1 cái là đầu vào n , 1 cái là đầu ra expected và có nhiều cặp như v
    */
    
   
    public static Object[][] initData(){
        Object[][] dataSet = {{0,1},
            {1,1},
            {2,2},
            {3,6},
            {4,24},
            {5,120}};       
        return dataSet;
    }
    @ParameterizedTest
    @MethodSource("initData")
     public void verifyFactorialGivenRightArgumentReturnsOK(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
