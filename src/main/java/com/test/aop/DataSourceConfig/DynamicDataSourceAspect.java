package com.test.aop.DataSourceConfig;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;


@Aspect
@Component
public class DynamicDataSourceAspect {

    @Before(value = "@annotation(DS)")
    @SuppressWarnings(value = "rawtypes")
    public void beforeSwitchDataSource(JoinPoint point){
        //获得当前访问的class
        Class<?> className = point.getTarget().getClass();
        //获得访问的方法名
        String methodName = point.getSignature().getName();
        //得到方法的参数类型
        Class[] argClass = ((MethodSignature)point.getSignature()).getParameterTypes();
        String dataSource = DataSourceContextHolder.DEFAULT_DS;
        try {
            // 得到访问的方法对象
            Method method = className.getMethod(methodName,argClass);
            // 判断是否有@DataSource注解
            if(method.isAnnotationPresent(DS.class)){
                DS annotation = method.getAnnotation(DS.class);
                //取出注解中的数据源名
                dataSource = annotation.value();
                System.out.println(dataSource);
                //切换数据源
                DataSourceContextHolder.setDB(dataSource);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    @After("@annotation(DS)")
    public void afterSwitchDS(JoinPoint point){
        DataSourceContextHolder.clearDB();
    }
}
