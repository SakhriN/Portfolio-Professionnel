package dbz.superexempledelespace.demo.aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecptionAspect {


    @Pointcut("@annotation(dbz.superexempledelespace.demo.annotation.ExecptionAnnotation)")
    public void execptPointCut(){
        System.out.println("execptPointCut");
    }

    @AfterThrowing(value = "execptPointCut()",throwing = "ex")
    public void afterThrowing (JoinPoint joinPoint, Exception ex){
        System.out.println("Message incroyable qui est arrivé : "+ex.getMessage()+ " "+ joinPoint.getSignature().getName());
    }
}
