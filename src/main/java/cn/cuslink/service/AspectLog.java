package cn.cuslink.service;

import cn.cuslink.dao.DbInterface;
import cn.cuslink.domain.Student;
import cn.cuslink.util.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Author:zhangchundong
 * @Date:Create in 10:27 2019/2/20
 */
@Aspect // 定义该类为切面类
@Component // 实例化
public class AspectLog{

   private org.slf4j.Logger log = LoggerFactory.getLogger(AspectLog.class);

   @Pointcut("@annotation(cn.cuslink.util.Logger)")
   public void add() {}
//   @Pointcut("@annotation(cn.cuslink.util.Logger)")
//   public void delete() {}
   @Pointcut("@annotation(cn.cuslink.util.Logger)")
   public void query() {}
   @Pointcut("@annotation(cn.cuslink.util.Logger)")
   public void modify() {}

   @Before("add()")
   public void addBefore(JoinPoint joinPoint){
      handleLog(joinPoint);
   }

   /**
    * 记录日志的详细操作
    * @param joinPoint
    */
   private void handleLog(JoinPoint joinPoint){
      // 拿到当前方法的数据
      String className = joinPoint.getTarget().getClass().getName();
      String methodName = joinPoint.getSignature().getName();
      Object[] args = joinPoint.getArgs();
      // 拿到注解上的数据
      Logger logger = getAnnotation(joinPoint);
      String dbName = logger.dbName();
      String handleDate = logger.handleDate();
      String handlePerson = logger.handlePerson();
      // 进行日志的记录
      log.info("className："+className+"===methodName："+methodName
               +"===dbName："+dbName+"===handleDate："+handleDate+"===handlePerson"+handlePerson);
   }

   /**
    * 通过反射拿到注解
    * @param joinPoint
    * @return
    */
   private Logger getAnnotation(JoinPoint joinPoint){
      Signature signature = joinPoint.getSignature();
      MethodSignature methodSignature = (MethodSignature) signature;
      // 拿到切入点的方法
      Method method = methodSignature.getMethod();
      if(null != method){
         // 拿到切入点上的注解
         return method.getAnnotation(Logger.class);
      }
      return null;
   }
}
