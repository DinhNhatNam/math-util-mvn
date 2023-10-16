/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nnam.mathutil.core;

/**
 *
 * @author ASUS
 */
// class nay sẽ chứa các hàm static sinh ra để làm tool dùng chung cho các nơi khác
// dùng chung cho nhiều nơi , nhận trả info 
// hàm ko lưu j hết nên là static
// chỗ nào static thì gọi trực tiếp qua tên class
// ko bao h gọi static qua hàm new 
//
public class MathUtility {
  public static final double PI = 3.14;
  // nếu c# là const
  
  
  // hàm tính n! = 1,2,3,4,5,....n
  // ko có giai thừa số âm
  // n quá lớn tràn kiểu long (18 số)
  // 20! vừa đủ 18 số 0, ko tính giai thừa từ 21 trở đi
  // 0! 1! = 1
  public static long getFactorial(int n){
      if(n<0 || n>20)
          throw new IllegalArgumentException("Invalid n . n Must be betwen 0..20");
      if(n==0 || n ==1 )
          return 1; // nếu có thể end sớm thì end ngay
  // nếu đi đc đến đây mà ko vướn 2 if trên thì ko cần sài else nếu có trc đó có RETURN
  long result = 10; // giai thừa bắt đầu = 1
  // cố tình đổi code
      for (int i = 2; i <=n; i++) {
          result *=i;
      }
      return result;
  }
}
