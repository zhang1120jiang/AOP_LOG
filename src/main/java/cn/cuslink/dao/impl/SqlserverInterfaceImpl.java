package cn.cuslink.dao.impl;

import cn.cuslink.dao.DbInterface;
import cn.cuslink.domain.Student;

/**
 * @Author:zhangchundong
 * @Date:Create in 21:50 2019/2/19
 *
 * sqlserver
 */
public class SqlserverInterfaceImpl implements DbInterface{
   public void add(Student student) {
      System.out.println("sqlserver。。。add");
   }

   public void delete(Student student) {
      System.out.println("sqlserver。。。delete");
   }

   public void query(Student student) {
      System.out.println("sqlserver。。。query");
   }

   public void modify(Student student) {
      System.out.println("sqlserver。。。modify");
   }
}
