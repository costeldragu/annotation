package com.mdc.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author : Costel DRAGU
 * @version $Id:$
 * @package : com.mdc.aspects
 * @copyright Copyright (c) 2017
 * @date : 14.11.2017 21:41
 */
@Component
@Aspect
public class Aspects {

    private static final Logger LOGGER = LoggerFactory.getLogger(Aspects.class);




    @Around("execution(* *(..)) && @annotation(com.mdc.annotation.MethodLogging)")
    public Object wrapMethod(final ProceedingJoinPoint point) throws Throwable {
        point.proceed();
        final Method method =
                MethodSignature.class.cast(point.getSignature()).getMethod();
        LOGGER.info("Method Name: " + method.getName());
        return null;
    }


//    @Around("execution(* com.mdc.controller.HomeController.homePage(..))")
//    public Object wrapMethodScond(final ProceedingJoinPoint point) throws Throwable {
//        final Method method =
//                MethodSignature.class.cast(point.getSignature()).getMethod();
//        LOGGER.info("Direct Method Name: " + method.getName());
//        return null;
//    }

//    @AfterReturning("execution(* com.mdc.controller.HomeController.homePage(..))")
//    public void logServiceAccess(JoinPoint joinPoint) {
//        LOGGER.info("Completed: " + joinPoint);
//    }
}
