package aop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

// <bean id="logAnnotation" class="aop.LogAspectAnnotation">
@Component("logAnnotation") // 将LogAspectAnnotation纳入springIOC容器中
@Aspect // 此类是一个通知
public class LogAspectAnnotation {

    // 前置通知
    @Before("execution(public * addStudent(..))") // 属性：定义切点
    public void myBefore(JoinPoint jp) {
        System.out.println("《注解形式-前置通知》：目标对象" + jp.getTarget() + ",方法名：" + jp.getSignature().getName() + ",参数列表：" + jp.getArgs().length);
    }

    // 后置通知
    @AfterReturning(pointcut="execution(public * addStudent(..))", returning="returningValue")
    public void myAfter(JoinPoint jp, Object returningValue) {
        System.out.println("《注解形式-后置通知》：目标对象" + jp.getTarget() + ",方法名：" + jp.getSignature().getName() + ",参数列表：" + jp.getArgs().length + ",返回值" + returningValue);
    }

    // 环绕通知
//    @Around("execution(public * addStudent(..))")
//    public void myAround(ProceedingJoinPoint jp) {
//        // 方法执行之前：前置通知
//        System.out.println("《【环绕】注解形式-前置通知》");
//        try {
//            // 方法执行时
//            jp.proceed();
//            // 方法执行之后：后置通知
//            System.out.println("《【环绕】注解形式-后置通知》");
//        } catch(Throwable e) {
//            // 发生异常时：异常通知
//            System.out.println("《【环绕】注解形式-异常通知》");
//        } finally {
//            // 最终通知
//            System.out.println("《【环绕】最终通知》");
//        }
//    }

    // 异常通知：如果只捕获特定类型的异常，则可以通过第二个参数实现：
//    @AfterThrowing(pointcut = "execution(public * addStudent(..))", throwing = "e")
//    public void myException(JoinPoint jp, NullPointerException e) { // 次异常通知只会捕获NullPointerException类型的异常
//        System.out.println("《注解形式-异常通知》----e" + e.getMessage());
//    }

    // 最终通知
    @After("execution(public * addStudent(..))")
    public void myAfter() {
        System.out.println("《[myAfter]注解形式-最终通知》");
    }
}
