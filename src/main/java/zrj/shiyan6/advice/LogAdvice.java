package zrj.shiyan6.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAdvice {

    @Pointcut("execution(void zrj.shiyan6.test.log())")
    public void pt(){};

    @Around("pt()")
    public Object logpt(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("开始");
        Object proceed = pjp.proceed();
        System.out.println("结束");
        return proceed;
    }


}
