package com.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class Quote implements MotivationHandler {

	@Override
	public String readQuote() {
		return "Just Do It!!!!";
	}

}
