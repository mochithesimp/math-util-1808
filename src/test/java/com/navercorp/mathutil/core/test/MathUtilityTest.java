/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.navercorp.mathutil.core.test;

import com.navercorp.mathutil.core.MathUtility;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HP
 */
public class MathUtilityTest {
    
    //Test case là bộ data đầu vào + các thao tác nhập xuất trên
    //          app / màn hình / hàm
    //          để verify một hàm/ màn hình/ chức năng đúng hay sai
    //          đề thi PE yêu cầu phải viết các test case
    //Test case #1: Check/test hàm factorial with n equals 0
    // *Input/Given n = 0
    // *Step/Procedure ( bước test )
    // Call method getFactorial(n)
    // *Expected result: 1 (hy vọng 0! = 1)
    // *Actual result: ??? chờ chạy hàm đã mới biết
    // *Status: passed | failed 
    @Test       // framework ép ta phài viết code theo quy tắc nào dó
                // thư viện thì cho viết tự do
    // framwork là thư viện nhưng thư viện chưa hẳn là framework
    public void testFactorialGivenRightArg0ReturnsWell(){
        assertEquals(1, MathUtility.getFactorial(0));
    }
    
    //Test case #2: Check/test hàm factorial with n equals 1
    // *Input/Given n = 1
    // *Step/Procedure ( bước test )
    // Call method getFactorial(n)
    // *Expected result: 1 (hy vọng 1! = 1)
    // *Actual result: ??? chờ chạy hàm đã mới biết
    // *Status: passed | failed 
    @Test       // framework ép ta phài viết code theo quy tắc nào dó
                // thư viện thì cho viết tự do
    // framwork là thư viện nhưng thư viện chưa hẳn là framework
    public void testFactorialGivenRightArg1ReturnsWell(){
        assertEquals(1, MathUtility.getFactorial(1));
    }
    
    //Test case #3: Check/test hàm factorial with n equals 5
    // *Input/Given n = 5
    // *Step/Procedure ( bước test )
    // Call method getFactorial(n)
    // *Expected result: 120 (hy vọng 5! = 120)
    // *Actual result: ??? chờ chạy hàm đã mới biết
    // *Status: passed | failed 
    @Test       // framework ép ta phài viết code theo quy tắc nào dó
                // thư viện thì cho viết tự do
    // framwork là thư viện nhưng thư viện chưa hẳn là framework
    public void testFactorialGivenRightArg5ReturnsWell(){
        assertEquals(120, MathUtility.getFactorial(5));
    }
    
    @Test
    public void testFactorialGivenRightArg12345ReturnsWell(){
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(120, MathUtility.getFactorial(5));
    }
    
    //Test case #5: Check getF() with n = -1, the method throw Exception
    @Test
    public void testFactorialGivenWrongArg_1ThrowsException(){
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-1);});
    }
    
    
    
    public MathUtilityTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
