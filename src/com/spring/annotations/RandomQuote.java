package com.spring.annotations;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
@Scope("singleton")
public class RandomQuote implements MotivationHandler {
	
	@Value("${quote.messages}")
	String quotesString;
	String quotes[];
	
	public RandomQuote() {
	}

	@Override
	public String readQuote() {
		Random random = new Random();
		int q = random.nextInt(quotes.length);
		return quotes[q];
	}
	
	@PostConstruct
	private void segregateQuotes() {
		quotes =  quotesString.split(" \n ");
	}

}
