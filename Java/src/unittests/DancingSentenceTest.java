package unittests;

import static org.junit.Assert.*;

import org.junit.Test;

import strings.DancingSentence;

public class DancingSentenceTest {

	@Test
	public void testConvert() {
		assertEquals("ThIs Is A dAnCiNg SeNtEnCe", DancingSentence.convert("This is a dancing sentence"));
		assertEquals(" ThIs   Is         A  dAnCiNg   SeNtEnCe  ", DancingSentence.convert(" This   is         a  dancing   sentence  "));
		assertEquals("AaAaAaAaAaA", DancingSentence.convert("aaaaaaaaaaa"));
		assertEquals("Z", DancingSentence.convert("z"));
	}

}
