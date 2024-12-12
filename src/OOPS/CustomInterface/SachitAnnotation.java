package OOPS.CustomInterface;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
//@Qualifier
public @interface SachitAnnotation {
}

/*
@SachitAnnotation
public class ServiceA implements MyService{
    @Override
    public void performTask(){
    System.out.println("Service A is performing its task now");
    }
}
 */