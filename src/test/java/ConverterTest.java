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

	
	@Test
	public void testConvertnumbersBetween90and139IntoRomanNumeral() throws Exception {
		Converter converter = new Converter();
		assertEquals("XCI", converter.converterArabicNumberIntoRomanNUmeral(91));
		assertEquals("XCIX", converter.converterArabicNumberIntoRomanNUmeral(99));
		assertEquals("C", converter.converterArabicNumberIntoRomanNUmeral(100));
		assertEquals("CXVIII", converter.converterArabicNumberIntoRomanNUmeral(118));
		assertEquals("CXXVII", converter.converterArabicNumberIntoRomanNUmeral(127));
		assertEquals("CXXXIX", converter.converterArabicNumberIntoRomanNUmeral(139));
	}
	
	@Test
	public void testConvertnumbersBetween140and200IntoRomanNumeral() throws Exception {
		Converter converter = new Converter();
		assertEquals("CXL", converter.converterArabicNumberIntoRomanNUmeral(140));
		assertEquals("CL", converter.converterArabicNumberIntoRomanNUmeral(150));
		assertEquals("CLXV", converter.converterArabicNumberIntoRomanNUmeral(165));
		assertEquals("CLXXIX", converter.converterArabicNumberIntoRomanNUmeral(179));
		assertEquals("CLXXXIV", converter.converterArabicNumberIntoRomanNUmeral(184));
		assertEquals("CLXXXIX", converter.converterArabicNumberIntoRomanNUmeral(189));
		assertEquals("CC", converter.converterArabicNumberIntoRomanNUmeral(200));
	}
	
	
	@Test
	public void testConvertnumbersBetween200and400IntoRomanNumeral() throws Exception {
		Converter converter = new Converter();
		assertEquals("CCXLVIII", converter.converterArabicNumberIntoRomanNUmeral(248));
		assertEquals("CCXCI", converter.converterArabicNumberIntoRomanNUmeral(291));
		assertEquals("CCCXLV", converter.converterArabicNumberIntoRomanNUmeral(345));
		assertEquals("CCCLXXXIX", converter.converterArabicNumberIntoRomanNUmeral(389));
		}
	
	
	@Test
	public void testConvertnumbersBetween400and899IntoRomanNumeral() throws Exception {
		Converter converter = new Converter();
		assertEquals("CD", converter.converterArabicNumberIntoRomanNUmeral(400));
		assertEquals("D", converter.converterArabicNumberIntoRomanNUmeral(500));
		assertEquals("DXLIX", converter.converterArabicNumberIntoRomanNUmeral(549));
		assertEquals("DCLXXXIX", converter.converterArabicNumberIntoRomanNUmeral(689));
		assertEquals("DCCXV", converter.converterArabicNumberIntoRomanNUmeral(715));
		assertEquals("DCCCXCIX", converter.converterArabicNumberIntoRomanNUmeral(899));
		}
	
	@Test
	public void testConvertnumbersBetween900and3999IntoRomanNumeral() throws Exception {
		Converter converter = new Converter();
		assertEquals("CM", converter.converterArabicNumberIntoRomanNUmeral(900));
		assertEquals("CMXLIX", converter.converterArabicNumberIntoRomanNUmeral(949));
		assertEquals("M", converter.converterArabicNumberIntoRomanNUmeral(1000));
		assertEquals("MDLXXXIX", converter.converterArabicNumberIntoRomanNUmeral(1589));
		assertEquals("MDCCCXCVI", converter.converterArabicNumberIntoRomanNUmeral(1896));
		assertEquals("MM", converter.converterArabicNumberIntoRomanNUmeral(2000));
		assertEquals("MMCMXCIX", converter.converterArabicNumberIntoRomanNUmeral(2999));
		assertEquals("MMMCCXLVIII", converter.converterArabicNumberIntoRomanNUmeral(3248));
		assertEquals("MMMCMXCIX", converter.converterArabicNumberIntoRomanNUmeral(3999));
		}
	
	@Test
	public void testConverterFromArabicNumberToRomanNumeralHandleNegativeValueOrValueAbove3999() throws Exception {
		Converter converter = new Converter();
		assertEquals("This is not a valid number for roman numeral", converter.converterArabicNumberIntoRomanNUmeral(-1));
		assertEquals("This is not a valid number for roman numeral", converter.converterArabicNumberIntoRomanNUmeral(4000));
		assertEquals("This is not a valid number for roman numeral", converter.converterArabicNumberIntoRomanNUmeral(-2565));
	}
	
	
	@Test
	public void testConvertIIntoArabicNumber() throws Exception {
		Converter converter = new Converter();
		assertEquals(1, converter.converterRomanNUmeralIntoArabicNumber("I"));
	}
	
	@Test
	public void testConvertIIIntoArabicNumber() throws Exception {
		Converter converter = new Converter();
		assertEquals(2, converter.converterRomanNUmeralIntoArabicNumber("II"));
	}
	
	@Test
	public void testConvertIIIIntoArabicNumber() throws Exception {
		Converter converter = new Converter();
		assertEquals(3, converter.converterRomanNUmeralIntoArabicNumber("III"));
	}
	
	@Test
	public void testConvertIVIntoArabicNumber() throws Exception {
		Converter converter = new Converter();
		assertEquals(4, converter.converterRomanNUmeralIntoArabicNumber("IV"));
	}
	
	@Test
	public void testConvertVIntoArabicNumber() throws Exception {
		Converter converter = new Converter();
		assertEquals(5, converter.converterRomanNUmeralIntoArabicNumber("V"));
	}
	
	@Test
	public void testConvertVIIntoArabicNumber() throws Exception {
		Converter converter = new Converter();
		assertEquals(6, converter.converterRomanNUmeralIntoArabicNumber("VI"));
	}
	
	@Test
	public void testConvertVIIIntoArabicNumber() throws Exception {
		Converter converter = new Converter();
		assertEquals(7, converter.converterRomanNUmeralIntoArabicNumber("VII"));
	}
	
	@Test
	public void testConvertVIIIIntoArabicNumber() throws Exception {
		Converter converter = new Converter();
		assertEquals(8, converter.converterRomanNUmeralIntoArabicNumber("VIII"));
	}
	
	@Test
	public void testConvertIXIntoArabicNumber() throws Exception {
		Converter converter = new Converter();
		assertEquals(9, converter.converterRomanNUmeralIntoArabicNumber("IX"));
	}
	
	@Test
	public void testConvertXIntoArabicNumber() throws Exception {
		Converter converter = new Converter();
		assertEquals(10, converter.converterRomanNUmeralIntoArabicNumber("X"));
	}
	@Test
	public void testConvertRomanNumeralBetween11and39ntoArabicNumber() throws Exception {
		Converter converter = new Converter();
		assertEquals(12, converter.converterRomanNUmeralIntoArabicNumber("XII"));
		assertEquals(20, converter.converterRomanNUmeralIntoArabicNumber("XX"));
		assertEquals(25, converter.converterRomanNUmeralIntoArabicNumber("XXV"));
		assertEquals(28, converter.converterRomanNUmeralIntoArabicNumber("XXVIII"));
		assertEquals(39, converter.converterRomanNUmeralIntoArabicNumber("XXXIX"));
	}
	
	@Test
	public void testConvertRomanNumeralBetween39and89ntoArabicNumber() throws Exception {
		Converter converter = new Converter();
		assertEquals(40, converter.converterRomanNUmeralIntoArabicNumber("XL"));
		assertEquals(46, converter.converterRomanNUmeralIntoArabicNumber("XLVI"));
		assertEquals(50, converter.converterRomanNUmeralIntoArabicNumber("L"));
		assertEquals(55, converter.converterRomanNUmeralIntoArabicNumber("LV"));
		assertEquals(69, converter.converterRomanNUmeralIntoArabicNumber("LXIX"));
		assertEquals(72, converter.converterRomanNUmeralIntoArabicNumber("LXXII"));
		assertEquals(89, converter.converterRomanNUmeralIntoArabicNumber("LXXXIX"));
	}
	
	@Test
	public void testConvertRomanNumeralBetween90and399ntoArabicNumber() throws Exception {
		Converter converter = new Converter();
		assertEquals(90, converter.converterRomanNUmeralIntoArabicNumber("XC"));
		assertEquals(100, converter.converterRomanNUmeralIntoArabicNumber("C"));
		assertEquals(128, converter.converterRomanNUmeralIntoArabicNumber("CXXVIII"));
		assertEquals(298, converter.converterRomanNUmeralIntoArabicNumber("CCXCVIII"));
		assertEquals(311, converter.converterRomanNUmeralIntoArabicNumber("CCCXI"));
		assertEquals(342, converter.converterRomanNUmeralIntoArabicNumber("CCCXLII"));
		assertEquals(399, converter.converterRomanNUmeralIntoArabicNumber("CCCXCIX"));
	}
	
	@Test
	public void testConvertRomanNumeralBetween400and899ntoArabicNumber() throws Exception {
		Converter converter = new Converter();
		assertEquals(400, converter.converterRomanNUmeralIntoArabicNumber("CD"));
		assertEquals(469, converter.converterRomanNUmeralIntoArabicNumber("CDLXIX"));
		assertEquals(500, converter.converterRomanNUmeralIntoArabicNumber("D"));
		assertEquals(542, converter.converterRomanNUmeralIntoArabicNumber("DXLII"));
		assertEquals(647, converter.converterRomanNUmeralIntoArabicNumber("DCXLVII"));
		assertEquals(713, converter.converterRomanNUmeralIntoArabicNumber("DCCXIII"));
		assertEquals(844, converter.converterRomanNUmeralIntoArabicNumber("DCCCXLIV"));
		assertEquals(899, converter.converterRomanNUmeralIntoArabicNumber("DCCCXCIX"));
	}
	
	@Test
	public void testConvertRomanNumeralBetween900and3999ntoArabicNumber() throws Exception {
		Converter converter = new Converter();
		assertEquals(900, converter.converterRomanNUmeralIntoArabicNumber("CM"));
		assertEquals(953, converter.converterRomanNUmeralIntoArabicNumber("CMLIII"));
		assertEquals(1000, converter.converterRomanNUmeralIntoArabicNumber("M"));
		assertEquals(1287, converter.converterRomanNUmeralIntoArabicNumber("MCCLXXXVII"));
		assertEquals(1697, converter.converterRomanNUmeralIntoArabicNumber("MDCXCVII"));
		assertEquals(1999, converter.converterRomanNUmeralIntoArabicNumber("MCMXCIX"));
		assertEquals(2000, converter.converterRomanNUmeralIntoArabicNumber("MM"));
		assertEquals(2687, converter.converterRomanNUmeralIntoArabicNumber("MMDCLXXXVII"));
		assertEquals(3158, converter.converterRomanNUmeralIntoArabicNumber("MMMCLVIII"));
		assertEquals(3668, converter.converterRomanNUmeralIntoArabicNumber("MMMDCLXVIII"));
		assertEquals(3999, converter.converterRomanNUmeralIntoArabicNumber("MMMCMXCIX"));
	}
	
	@Test
	public void testConvertRomanNumeralCheckIfStringGivenIsARomanNumeral() throws Exception {
		Converter converter = new Converter();
		assertEquals(0, converter.converterRomanNUmeralIntoArabicNumber("CMZ"));
		assertEquals(0, converter.converterRomanNUmeralIntoArabicNumber("B"));
	}
}
