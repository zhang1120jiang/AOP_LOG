package cn.cuslink.web;

import cn.cuslink.domain.Student;
import cn.cuslink.service.impl.HandleServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:zhangchundong
 * @Date:Create in 14:17 2019/2/20
 */
//@Controller
public class LogAopController {

//   @RequestMapping("hello")
//   @ResponseBody
//   public Student addStu(Student student){
//
//   }
   private ClassPathXmlApplicationContext applicationContext;
   @Before
   public void loadXml(){
      applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
   }

   @Test
   public void test(){
      HandleServiceImpl serviceImpl = (HandleServiceImpl) applicationContext.getBean("handleServiceImpl");
      Student student = new Student();
      student.setAge(19);
      student.setName("张三");
      student.setSutNo(1);
      serviceImpl.addStu(student);
   }
   @Test
   public void test02(){
      HandleServiceImpl serviceImpl = (HandleServiceImpl) applicationContext.getBean("handleServiceImpl");
      Student student = new Student();
      student.setAge(19);
      student.setName("张三");
      student.setSutNo(1);
      serviceImpl.delStu(student);
   }
}
