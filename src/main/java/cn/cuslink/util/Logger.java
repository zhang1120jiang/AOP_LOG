package cn.cuslink.util;

import java.lang.annotation.*;
import java.util.Date;

/**
 * @Author:zhangchundong
 * @Date:Create in 10:26 2019/2/20
 * 自定义注解
 * 该注解用于日志的记录
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Logger {
   /**
    * 数据库名称
    * @return
    */
   String dbName() default "";

   /**
    * 什么时间处理了
    * @return
    */
   String handleDate() default "";

   /**
    * 什么人
    * @return
    */
   String handlePerson() default "";
}
