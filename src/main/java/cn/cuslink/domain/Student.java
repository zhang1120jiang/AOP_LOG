package cn.cuslink.domain;

/**
 * @Author:zhangchundong
 * @Date:Create in 11:42 2019/2/20
 */

public class Student {

   private String name;
   private Integer age;
   private  int sutNo;

   public int getSutNo() {
      return sutNo;
   }

   public void setSutNo(int sutNo) {
      this.sutNo = sutNo;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Integer getAge() {
      return age;
   }

   public void setAge(Integer age) {
      this.age = age;
   }
}
