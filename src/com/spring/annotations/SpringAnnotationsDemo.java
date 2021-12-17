package com.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationsDemo {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach coach = context.getBean("badmintonCoach", Coach.class);

		String msg = "Hi\n" + "I am your coach, " + coach.getName() + ". \n" + coach.getMotivated() + "\n"
				+ "Today's task: " + coach.getAdvice() + "\n" + "if you need help, feel free to contact me: "
				+ coach.getContact() + "\nBest Wishes!!!";
		System.out.println(msg);

		context.close();
	}

}
