package aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

// 普通类 -> 前置通知
public class LogBefore implements MethodBeforeAdvice {

    // 前置通知的具体内容
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("前置通知...");
    }
}
