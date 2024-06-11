package com.navercorp.mathutil.core;

public class MathUtility {

    // hàm tính n! = 1 . 2. 3. 4 . ... n
    //Hàm là static vì tính xong trả về th, không nhớ nhung gì cã
    //Thường các thư viện sẽ là static dùng chung tính toán mọi số liệu
    
    //Quy ước 0! = 1! = 1
    //Bài này chỉ làm từ 0 -> 20! vì 21! vượt (long)  
    public static long getFactorial(int n){
        
//        long product = 1; //tích kết quả phép nhân
        //update code again to see the green forever
        
        if(n < 0 || n > 20){
            throw new IllegalArgumentException("Invalid n. n must be between 0 ... 20");
        }
        
        if(n == 0 || n == 1){
            return 1;
        }
        
        return n * getFactorial(n-1);
        //Recursion
    }
}