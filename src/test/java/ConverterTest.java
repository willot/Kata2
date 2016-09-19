import static org.junit.Assert.*;

import org.junit.Test;

public class ConverterTest {
	
	@Test
	public void testConvertI1IntoRomanNumeral() throws Exception {
		
		Converter converter = new Converter();
		assertEquals("I", converter.converterArabicNumberIntoRomanNUmeral(1));
	}
	
	@Test
	public void testConvert2IntoRomanNumeral() throws Exception {
		Converter converter = new Converter();
		assertEquals("II", converter.converterArabicNumberIntoRomanNUmeral(2));
	}

}
