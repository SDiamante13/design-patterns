package edu.pattern.abstractfactory;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.pattern.abstractfactory.Questions;
import edu.pattern.abstractfactory.QuestionsEn;
import edu.pattern.abstractfactory.QuestionsEs;
import edu.pattern.abstractfactory.Greetings;
import edu.pattern.abstractfactory.GreetingsEn;
import edu.pattern.abstractfactory.GreetingsEs;

public class TestMultilingual {

	@Test
	public void test_en() {

		EnglishCommunicationFactory englishCommunicationFactory = new EnglishCommunicationFactory();

		Questions questions = englishCommunicationFactory.createQuestions();

		assertEquals("what time is it?", questions.askTime() );
		assertEquals("how is the weather?", questions.askWeather() );

		Greetings greetings = englishCommunicationFactory.createGreetings();

		assertEquals("good morning", greetings.goodMorning());
		assertEquals("good afternoon", greetings.goodAfternoon());
	}

	@Test
	public void test_es() {
		SpanishCommunicationFactory spanishCommunicationFactory = new SpanishCommunicationFactory();

		Questions questions = spanishCommunicationFactory.createQuestions();
		
		assertEquals("¿qué hora es?", questions.askTime() );
		assertEquals("¿qué tiempo hace?", questions.askWeather() );
		
		Greetings greetings = spanishCommunicationFactory.createGreetings();
		
		assertEquals("buenos días", greetings.goodMorning());
		assertEquals("buenas tardes", greetings.goodAfternoon());
	}
	
}
