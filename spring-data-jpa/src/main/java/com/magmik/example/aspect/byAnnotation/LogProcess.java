package com.magmik.example.aspect.byAnnotation;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

public @interface LogProcess {

    String processName() default "";

    @AliasFor("processName")
    String value() default "";

    String inParams() default "IN";

    String outParamName() default "OUT";

}
