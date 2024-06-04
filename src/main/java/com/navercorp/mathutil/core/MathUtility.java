package com.navercorp.mathutil.core;

public class MathUtility {

    // hàm tính n! = 1 . 2. 3. 4 . ... n
    //Hàm là static vì tính xong trả về th, không nhớ nhung gì cã
    //Thường các thư viện sẽ là static dùng chung tính toán mọi số liệu
    
    //Quy ước 0! = 1! = 1
    //Bài này chỉ làm từ 0 -> 20! vì 21! vượt (long)  
    public static long getFactorial(int n){
        
        long product = 1; //tích kết quả phép nhân
        
        if(n < 0 || n > 20){
            throw new IllegalArgumentException("Invalid n. n must be between 0 ... 20");
        }
        
        if(n == 0){
            return 1;
        }
        
        for (int i = 1; i <= n; i++)
            product *= i;
        
        return product;
    }
}