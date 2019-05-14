package org.john.xyz.annotation;


import java.lang.annotation.*;

@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {

    /**
     * 列名
     */
    String value() default "";

}
