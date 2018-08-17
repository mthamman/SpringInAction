package com.springinaction.knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/spring/knights.xml");
		Knight knight = (Knight) context.getBean("knight");
		knight.embarkOnQuest();
		context.close();
	}
}