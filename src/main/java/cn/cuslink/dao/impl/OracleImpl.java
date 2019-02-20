package cn.cuslink.dao.impl;

import cn.cuslink.dao.DbInterface;
import cn.cuslink.domain.Student;

/**
 * @Author:zhangchundong
 * @Date:Create in 21:55 2019/2/19
 */

public class OracleImpl implements DbInterface {
   public void add(Student student) {
      System.out.println("Oracle。。。add");
   }

   public void delete(Student student) {
      System.out.println("Oracle。。。delete");
   }

   public void query(Student student) {
      System.out.println("Oracle。。。query");
   }

   public void modify(Student student) {
      System.out.println("Oracle。。。modify");
   }
}
