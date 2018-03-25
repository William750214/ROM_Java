package heynas.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Date;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TestAnno {
    int id();

    String description() default "abc";

//    TestAnno01 ta();

    SuppressWarnings sw();

    String[] strings();
}
