package heynas.test;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(Fkgs.class)
public @interface Fkg {
    String name();
}
