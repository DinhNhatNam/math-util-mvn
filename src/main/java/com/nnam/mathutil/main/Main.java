/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.nnam.mathutil.main;

import com.nnam.mathutil.core.MathUtility;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TestCase#1: 
        int n =0;
        long expected=1; // 0! sẽ  trả ra 1 
        long actual= MathUtility.getFactorial(n); // đợi gọi hàm là biết 
        
        
        // so sánh giữa expected == actual 
        System.out.println(n+"! expected : "+expected+               
                "| actual: "+actual);
        
        n = 5;
        expected = 120;
        actual =MathUtility.getFactorial(n);
        System.out.println(n+"! expected : "+expected+               
                "| actual: "+actual);
    }
    
}
// dân dev viết code thì p có trách nhiệm test code của mình
// làm sao để test code của chính mình :3 cách
// c1: in ra màn hình kết quả xử lý
// c2 : in ra log file
// c3 : dùng đồ chơi - thư viện ,.....

// gồm 3 công việc : 
// thiết kế test case
// thực thi test case - test run
// ghi bug nếu có - log bug


// test case là bộ data đưa vào app để xem app hành xử đúng với expected value ko
// kèm thêm hướng dẫn sử dụng
// kèm thêm trạng thái đúng sai 

// cấu trúc

// testcaseID || testcase description || steps/procedures

// expected result || status (pass|fail)

//test case là 1 tình huống sài app với bộ data đưa vào và giá trị kì vọng app p trả về 

// muốn test hàm getF() ta phải thiết kế các test case coi xem hàm trả về đúng ko 

//TESTCASE#1 : VERIFY getFactorial(with n =0) check 0! true false
// test steps/procedures
// 1. GIVEN n =0 
// 2. Call/invoke getFactorial(n=0)


// EXPECTED RESULT : 
//          the method must return 1 as the result of 0!

//STATUS: PASSED || FAILED , just waiting


//TESTCASE#2 : VERIFY getFactorial(with n =5) check 5! true false
// test steps/procedures
// 1. GIVEN n =5
// 2. Call/invoke getFactorial(n=5)


// EXPECTED RESULT : 
//          the method must return 120 as the result of 5!

//STATUS: PASSED || FAILED , just waiting