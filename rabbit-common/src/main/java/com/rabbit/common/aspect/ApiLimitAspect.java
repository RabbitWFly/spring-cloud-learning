package com.rabbit.common.aspect;

import com.rabbit.common.anno.ApiRateLimit;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;

/**
 * @Author chentao
 * Date 2019/3/26
 * Description 具体API并发控制
 **/
@Aspect
@Order(value = Ordered.HIGHEST_PRECEDENCE)
public class ApiLimitAspect {
    public static Map<String, Semaphore> semaphoreMap = new ConcurrentHashMap<String, Semaphore>();

    @Around("execution(* com.rabbit.*.*.controller.*.*(..))")
    public Object around(ProceedingJoinPoint joinPoint) {
        Object result = null;
        Semaphore semap = null;
        Class<?> clazz = joinPoint.getTarget().getClass();
        String key = getRateLimitKey(clazz, joinPoint.getSignature().getName());

        if (key != null) {
            semap = semaphoreMap.get(key);
        } else {
            semap = semaphoreMap.get("open.api.defaultLimit");
        }
        try {
            if (semap != null) {
                semap.acquire();
            }
            result = joinPoint.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } finally {
            if (semap != null) {
                semap.release();
            }
        }
        return result;
    }

    private String getRateLimitKey(Class<?> clazz, String methodName) {
        Map<String, String> map = new HashMap<String, String>();
        for (Method method : clazz.getDeclaredMethods()) {
            if(method.getName().equals(methodName)){
                if (method.isAnnotationPresent(ApiRateLimit.class)) {
                    String key = method.getAnnotation(ApiRateLimit.class).confKey();
                    return key;
                }
            }
        }
        return null;
    }

}

