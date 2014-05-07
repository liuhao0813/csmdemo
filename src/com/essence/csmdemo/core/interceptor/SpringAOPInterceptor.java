package com.essence.csmdemo.core.interceptor;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.essence.csmdemo.privilege.aop.OperationSource;

/**
 * SPRING的拦截器 对所有方法进行拦截可进行日志，权限过滤
 * 
 * @author
 *
 */
public class SpringAOPInterceptor implements MethodInterceptor {

	
	public Object invoke(MethodInvocation invocation) throws Throwable {

		Method method = invocation.getMethod();
		System.out.println("The Interceptor method name is: "
						+ method.getDeclaringClass().getName() + "==================."
						+ method.getName()+"======================="+method.getClass()); 
		
		OperationSource operationSource = method.getAnnotation(OperationSource.class);
		
		if (operationSource != null) {

			// 此处判断是否有权限
			System.out.println("添加权限过滤，所属的权限为：code="+operationSource.code()+",opration="+operationSource.operation());
			return invocation.proceed();
		} else {
			System.out.println("没有添加权限过滤，可直接执行");
			return invocation.proceed();
		}
		
	}
}
