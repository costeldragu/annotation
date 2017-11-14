package com.mdc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author : Costel DRAGU
 * @version $Id:$
 * @package : com.mdc.annotation
 * @copyright Copyright (c) 2017 GameLoft
 * @date : 14.11.2017 21:25
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MethodLogging {
    /**
     * DEBUG level of logging.
     */
    int DEBUG = 0;

    /**
     * INFO level of logging.
     */
    int INFO = 1;

    /**
     * WARN level of logging.
     */
    int WARN = 2;

    /**
     * ERROR level of logging.
     */
    int ERROR = 3;

    /**
     * Logger type value
     * @return
     */
    int value() default MethodLogging.INFO;

    /**
     * Logger name
     * @return
     */
    String name() default "";
}
