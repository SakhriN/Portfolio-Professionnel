package dbz.superexempledelespace.demo.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {


    @Pointcut("@annotation(dbz.superexempledelespace.demo.annotation.BeforeAnnotation)")
    public void beforePointCut(){
    }

    @Pointcut("@annotation(dbz.superexempledelespace.demo.annotation.AfterAnnotation)")
    public void afterPointCut(){
    }

    @Before("beforePointCut()")
    public void beforeMethod() {
        System.out.println("Début de la méthode.");
    }

    // Action à effectuer après la méthode annotée avec @AfterAnnotation
    @After("afterPointCut()")
    public void afterMethod() {
        System.out.println("Méthode terminée.");
    }



}
