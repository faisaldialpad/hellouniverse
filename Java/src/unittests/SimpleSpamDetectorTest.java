package unittests;

import static org.junit.Assert.*;

import org.junit.Test;

import strings.SimpleSpamDetector;

public class SimpleSpamDetectorTest {

	@Test
	public void testCountKeywords() {
		assertEquals(4, SimpleSpamDetector.countKeywords("LoooW INTEREST RATES available dont BE slow", new String[]{"interest","rates","loan","available","LOW"}));
		assertEquals(2, SimpleSpamDetector.countKeywords("Dear Richard Get Rich Quick            no risk", new String[]{"rich","risk","Quicken","wealth","SAVE"}));
		assertEquals(3, SimpleSpamDetector.countKeywords("in debbtt againn and aAgain and AGAaiIN", new String[]{"AGAIN","again","Again","again"}));
		assertEquals(3, SimpleSpamDetector.countKeywords("PlAyy ThEE Lottto     get Loottoo feever", new String[]{"play","lotto","lottery","looser"}));
		assertEquals(0, SimpleSpamDetector.countKeywords("                                   ", new String[]{"empty","space","does","not","match"}));
		assertEquals(0, SimpleSpamDetector.countKeywords("", new String[]{"nothing", "nada", "zip", "nil", "squat", "vaccuum"}));
	}

}
