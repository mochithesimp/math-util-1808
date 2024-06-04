package com.navercorp.mathutil.main;

import com.navercorp.mathutil.core.MathUtility;
import javax.swing.JOptionPane;

public class MathUtil1808 {

    public static void main(String[] args) {
        //CÁCH 2: TEST HÀM = CÁCH POPUP
        int n = 0;
        long expectedValued = 1;
        long actualValue = MathUtility.getFactorial(n);    // chờ hàm trở về

        String result = n + "! | Expected: " + expectedValued + " | Actual " + actualValue;
        JOptionPane.showMessageDialog(null, result);
    }

//    public static void main(String[] args) {
//        //TEST CASE #01
//        // N = 0, EX VALUE: 1, ACTUAL VALUE: ?, STATUS: PASSED/FAILED
//        int n = 0;
//        long expectedValued = 1;
//        long actualValue = MathUtility.getFactorial(n);    // chờ hàm trở về
//        
//        System.out.println("0! | Expected: " + expectedValued + " " + "Actual: " + actualValue);
//        
//        //TEST CASE #02
//        //N = 1, EX VALUE: 1, ACTUAL VALUE: ?, STATUS: PASSED/FAILED
//        n = 1;
//        expectedValued = 1;
//        actualValue = MathUtility.getFactorial(n);    // chờ hàm trở về
//        
//        System.out.println("1! | Expected: " + expectedValued + " " + "Actual: " + actualValue);
//        
//        //TEST CASE #03
//        //N = 5, EX VALUE: 120, ACTUAL VALUE: ?, STATUS: PASSED/FAILED
//        n = 5;
//        expectedValued = 120;
//        actualValue = MathUtility.getFactorial(n);    // chờ hàm trở về
//        
//        System.out.println("5! | Expected: " + expectedValued + " " + "Actual: " + actualValue);
//        
//        //TEST CASE #04
//        //N = -1, EX VALUE: THẤY NGOẠI LỆ, ACTUAL VALUE: ?, STATUS: PASSED/FAILED
//        System.out.println("Check if Illegal Arguement Exception is thrown");
//        n = -1;
//        //expectedValued = ;
//        actualValue = MathUtility.getFactorial(n);    // chờ hàm trở về
//        
//        System.out.println("-1! | Expected: " + expectedValued + " " + "Actual: " + actualValue);
//        
//    }
}
