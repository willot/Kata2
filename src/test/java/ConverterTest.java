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

	
	@Test
	public void testConvert3IntoRomanNumeral() throws Exception {
		Converter converter = new Converter();
		assertEquals("III", converter.converterArabicNumberIntoRomanNUmeral(3));
	}
	
	@Test
	public void testConvert4IntoRomanNumeral() throws Exception {
		Converter converter = new Converter();
		assertEquals("IV", converter.converterArabicNumberIntoRomanNUmeral(4));
	}
	
	@Test
	public void testConvert5IntoRomanNumeral() throws Exception {
		Converter converter = new Converter();
		assertEquals("V", converter.converterArabicNumberIntoRomanNUmeral(5));
	}
	
	@Test
	public void testConvert6IntoRomanNumeral() throws Exception {
		Converter converter = new Converter();
		assertEquals("VI", converter.converterArabicNumberIntoRomanNUmeral(6));
	}
	
	@Test
	public void testConvert8IntoRomanNumeral() throws Exception {
		Converter converter = new Converter();
		assertEquals("VIII", converter.converterArabicNumberIntoRomanNUmeral(8));
	}
	
	@Test
	public void testConvert9IntoRomanNumeral() throws Exception {
		Converter converter = new Converter();
		assertEquals("IX", converter.converterArabicNumberIntoRomanNUmeral(9));
	}
	
	@Test
	public void testConvert10IntoRomanNumeral() throws Exception {
		Converter converter = new Converter();
		assertEquals("X", converter.converterArabicNumberIntoRomanNUmeral(10));
	}
	
	@Test
	public void testConvertnumbersBetween10and39IntoRomanNumeral() throws Exception {
		Converter converter = new Converter();
		assertEquals("XV", converter.converterArabicNumberIntoRomanNUmeral(15));
		assertEquals("XXII", converter.converterArabicNumberIntoRomanNUmeral(22));
		assertEquals("XXX", converter.converterArabicNumberIntoRomanNUmeral(30));
		assertEquals("XXXIII", converter.converterArabicNumberIntoRomanNUmeral(33));
		assertEquals("XXXVII", converter.converterArabicNumberIntoRomanNUmeral(37));
		assertEquals("XXXIX", converter.converterArabicNumberIntoRomanNUmeral(39));
	}
	
	
	@Test
	public void testConvertnumbersBetween40and89IntoRomanNumeral() throws Exception {
		Converter converter = new Converter();
		assertEquals("XL", converter.converterArabicNumberIntoRomanNUmeral(40));
		assertEquals("LII", converter.converterArabicNumberIntoRomanNUmeral(52));
		assertEquals("LXIV", converter.converterArabicNumberIntoRomanNUmeral(64));
		assertEquals("LXXIX", converter.converterArabicNumberIntoRomanNUmeral(79));
		assertEquals("LXXXV", converter.converterArabicNumberIntoRomanNUmeral(85));
		assertEquals("LXXXIX", converter.converterArabicNumberIntoRomanNUmeral(89));
	}


}
