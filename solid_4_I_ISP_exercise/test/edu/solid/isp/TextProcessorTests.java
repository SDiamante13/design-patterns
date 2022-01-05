package edu.solid.isp;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.solid.isp.Language;
import edu.solid.isp.TextProcessor;


public class TextProcessorTests {

	@Test
	public void simple_test() {
		
		TextProcessor processor = new TextProcessor();
		
		processor.add("Spelynk");
		processor.add("doesnt");
		processor.add("matter");
		
		assertEquals("Spelynk doesnt matter", processor.text());
	}
	
	@Test
	public void test_using_language() {
		
		TextProcessor processor = new TextProcessor();
		
		processor.add("I");
		processor.add("am");
		processor.add("hungry");
		
		assertEquals("I am hungry", processor.text());
		
		assertTrue(processor.correct(Language.EN));
	}
}
