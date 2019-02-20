package cn.cuslink.dao;

import cn.cuslink.domain.Student;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @Author:zhangchundong
 * @Date:Create in 21:49 2019/2/19
 */

public interface DbInterface {
   public void add(Student student);
   public void delete(Student student);
   public void query(Student student);
   public void modify(Student student);
}
