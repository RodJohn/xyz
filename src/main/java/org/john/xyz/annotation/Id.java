package org.john.xyz.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Column()
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Id {

    /**
     * 主键是否自增
     */
    boolean isAutoIncrement() default false;

}
