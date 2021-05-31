package com.spring.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
																	// src/main/resource 까진 알려줌
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:META-INF/spring.xml");
		
		// 주소값 얻어옴, 여러 번해도 같은 주소값 알랴둠, 싱글톤
		// xml에서 scope="prototype"을 설정하면 요청할 때마다 새로운 객체 생성해쥼
		MITv tv1 = ctx.getBean("mitv", MITv.class); 
		
		tv1.volumeUp();
		tv1.volumeUp();
	}
}