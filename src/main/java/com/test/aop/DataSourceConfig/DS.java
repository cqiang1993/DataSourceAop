package com.test.aop.DataSourceConfig;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface DS {
    String value();
}
