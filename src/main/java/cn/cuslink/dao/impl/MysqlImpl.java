package cn.cuslink.dao.impl;

import cn.cuslink.dao.DbInterface;
import cn.cuslink.domain.Student;
import org.springframework.stereotype.Repository;

/**
 * @Author:zhangchundong
 * @Date:Create in 21:54 2019/2/19
 */
@Repository("mysqlImpl")
public class MysqlImpl implements DbInterface {
   public void add(Student student) {
      System.out.println("Mysql。。。add");
   }

   public void delete(Student student) {
      System.out.println("Mysql。。。delete");
   }

   public void query(Student student) {
      System.out.println("Mysql。。。query");
   }

   public void modify(Student student) {
      System.out.println("Mysql。。。modify");
   }
}
