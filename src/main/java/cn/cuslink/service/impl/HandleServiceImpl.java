package cn.cuslink.service.impl;

import cn.cuslink.dao.DbInterface;
import cn.cuslink.domain.Student;
import cn.cuslink.service.HandleService;
import cn.cuslink.util.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author:zhangchundong
 * @Date:Create in 14:19 2019/2/20
 */
@Service
public class HandleServiceImpl implements HandleService {

   @Autowired
   @Qualifier("mysqlImpl")
   private DbInterface dbInterface;

   @Logger(dbName = "mysql",handleDate = "2019",handlePerson = "admin")
   public void addStu(Student student) {
      dbInterface.add(student);
   }

   public void delStu(Student student) {
      dbInterface.delete(student);
   }
}
