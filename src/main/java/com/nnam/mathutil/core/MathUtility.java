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
//  public static long getFactorial(int n){
//      if(n<0 || n>20)
//          throw new IllegalArgumentException("Invalid n . n Must be betwen 0..20");
//      if(n==0 || n ==1 )
//          return 1; // nếu có thể end sớm thì end ngay
//  // nếu đi đc đến đây mà ko vướn 2 if trên thì ko cần sài else nếu có trc đó có RETURN
//  long result = 1; // giai thừa bắt đầu = 1
//  // cố tình đổi code 
//      for (int i = 2; i <=n; i++) {
//          result *=i;
//      }
//      return result;
//  }
  public static long getFactorial(int n){ 
//n!
      if(n<0 || n>20)
          throw new IllegalArgumentException("Invalid n . n Must be betwen 0..20");
      if(n==0 || n ==1 )
          return 1; // nếu có thể end sớm thì end ngay
return n * getFactorial(n-1);
  }
  /*
  đệ quy là gọi lại chính mình với quy mô nhỏ hơn 
đệ quy p có điểm dừng 
  
  với đề bài trên 
  N! = N.(N-1)!
  */
  // kĩ thuật kiểm thử hồi quy - regrestion test
  /*
  test lại những thứ cần test để xác nhận rằng nó ổn 
  vì code theo thời gian có thay đổi 
  + do fix bug
  + do tối ưu chỉnh sửa code để code đẹp hơn, tốt hơn , nhanh hơn 
  + thêm hàm mới 
  
  khi sửa code p chạy lại bộ test để đảm bảo nó vẫn ok 
  nếu test = tay thì tốn sức + dễ sai 
  
  nếu dùng test cript thì chỉ việc run nhìn kết quả
  xanh -> ổn 
  đỏ -> cần sửa tiếp 
  nhanh , ko mất sức miễ là đủ test case
  
  test lại những thứ đã từng test gọi là test hồi qy
  */
}
