package aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

// <bean id="logAnnotation" class="aop.LogAspectAnnotation">
@Component("logAnnotation") // 将LogAspectAnnotation纳入springIOC容器中
@Aspect // 此类是一个通知
public class LogAspectAnnotation {

    @Before("execution(public * addStudent(..))") // 属性：定义切点
    public void myBefore() {
        System.out.println("《注解形式-前置通知》");
    }

    @AfterReturning("execution(public * addStudent(..))")
    public void myAfter() {
        System.out.println("《注解形式-后置通知》");
    }
}
