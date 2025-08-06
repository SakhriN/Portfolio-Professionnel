package dbz.superexempledelespace.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class PerformanceAspect {


    @Pointcut("@annotation(dbz.superexempledelespace.demo.annotation.AroundAnnotation)")
    public void aroundPointCut(){
    }

    @Around("aroundPointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        Long debut = System.currentTimeMillis();
        Object resultat = joinPoint.proceed();
        Long fin = System.currentTimeMillis() + (Long)(Math.round(Math.random()*500));
        Long duree = fin - debut ;
        System.out.println("durée de la fonction  : "+ duree + " ms.");
    return resultat;
    }


}
