package com.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach {
	
	@Autowired
	@Qualifier("randomQuote")
	MotivationHandler mHandler;
	
	@Value("${Badminton.coach.name}")
	private String name;
	@Value("${Badminton.coach.contact}")
	private String contact;
	
	public BadmintonCoach() {
	}
	
	/*
	 * @Autowired public void setmHandler(MotivationHandler mHandler) {
	 * this.mHandler = mHandler; }
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String getAdvice() {
		return "Smash it faster....";
	}

	@Override
	public String getMotivated() {
		return mHandler.readQuote();
	}

}
