package com.magmik.example.aspect.byAnnotation;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
@Slf4j
public class CustomLogger {
    Logger log = LogManager.getLogger(CustomLogger.class);

    //not good need change the code
    //add @LogProcess to MainController
    @Around("@annotation(logProcess)")
    public Object logExecutionTime(ProceedingJoinPoint point, LogProcess logProcess) throws Throwable {
        log.info("BEGIN : {}", logProcess.value());
        long start = System.currentTimeMillis();
        Object[] args = point.getArgs();
        log.info("{}: {}", logProcess.inParams(), Arrays.toString(args));
        Object result = point.proceed();
        log.info("{}: {}", logProcess.outParamName(), result);
        log.info("END : {} : {} ms", logProcess.value(), System.currentTimeMillis() - start);
        return result;
    }
}