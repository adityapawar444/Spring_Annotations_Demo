package com.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class KabaddiCoach implements Coach {
	
	
	@Autowired
	@Qualifier("randomQuote")
	MotivationHandler mhandler;
	
	@Value("${Kabaddi.coach.name}")
	private String name;
	@Value("${Kabaddi.coach.contact}")
	private String contact;
	
	public KabaddiCoach() {
	}

	
	/*
	 * public void setMhandler(MotivationHandler mhandler) { this.mhandler =
	 * mhandler; }
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
		return "Play an aggressive game!!!";
	}

	@Override
	public String getMotivated() {
		return mhandler.readQuote();
	}

}
