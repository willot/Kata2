import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Rule;

public class ConverterTest {
	
	@Test
	public void testConvertI1IntoRomanNumeral() throws Exception {
		
		Converter converter = new Converter();
		assertEquals("I", converter.convertArabicNumberIntoRomanNUmeral(1));
	}
	
	@Test
	public void testConvert2IntoRomanNumeral() throws Exception {
		Converter converter = new Converter();
		assertEquals("II", converter.convertArabicNumberIntoRomanNUmeral(2));
	}

	
	@Test
	public void testConvert3IntoRomanNumeral() throws Exception {
		Converter converter = new Converter();
		assertEquals("III", converter.convertArabicNumberIntoRomanNUmeral(3));
	}
	
	@Test
	public void testConvert4IntoRomanNumeral() throws Exception {
		Converter converter = new Converter();
		assertEquals("IV", converter.convertArabicNumberIntoRomanNUmeral(4));
	}
	
	@Test
	public void testConvert5IntoRomanNumeral() throws Exception {
		Converter converter = new Converter();
		assertEquals("V", converter.convertArabicNumberIntoRomanNUmeral(5));
	}
	
	@Test
	public void testConvert6IntoRomanNumeral() throws Exception {
		Converter converter = new Converter();
		assertEquals("VI", converter.convertArabicNumberIntoRomanNUmeral(6));
	}
	
	@Test
	public void testConvert8IntoRomanNumeral() throws Exception {
		Converter converter = new Converter();
		assertEquals("VIII", converter.convertArabicNumberIntoRomanNUmeral(8));
	}
	
	@Test
	public void testConvert9IntoRomanNumeral() throws Exception {
		Converter converter = new Converter();
		assertEquals("IX", converter.convertArabicNumberIntoRomanNUmeral(9));
	}
	
	@Test
	public void testConvert10IntoRomanNumeral() throws Exception {
		Converter converter = new Converter();
		assertEquals("X", converter.convertArabicNumberIntoRomanNUmeral(10));
	}
	
	@Test
	public void testConvertnumbersBetween10and39IntoRomanNumeral() throws Exception {
		Converter converter = new Converter();
		assertEquals("XV", converter.convertArabicNumberIntoRomanNUmeral(15));
		assertEquals("XXII", converter.convertArabicNumberIntoRomanNUmeral(22));
		assertEquals("XXX", converter.convertArabicNumberIntoRomanNUmeral(30));
		assertEquals("XXXIII", converter.convertArabicNumberIntoRomanNUmeral(33));
		assertEquals("XXXVII", converter.convertArabicNumberIntoRomanNUmeral(37));
		assertEquals("XXXIX", converter.convertArabicNumberIntoRomanNUmeral(39));
	}
	
	
	@Test
	public void testConvertnumbersBetween40and89IntoRomanNumeral() throws Exception {
		Converter converter = new Converter();
		assertEquals("XL", converter.convertArabicNumberIntoRomanNUmeral(40));
		assertEquals("LII", converter.convertArabicNumberIntoRomanNUmeral(52));
		assertEquals("LXIV", converter.convertArabicNumberIntoRomanNUmeral(64));
		assertEquals("LXXIX", converter.convertArabicNumberIntoRomanNUmeral(79));
		assertEquals("LXXXV", converter.convertArabicNumberIntoRomanNUmeral(85));
		assertEquals("LXXXIX", converter.convertArabicNumberIntoRomanNUmeral(89));
	}

	
	@Test
	public void testConvertnumbersBetween90and139IntoRomanNumeral() throws Exception {
		Converter converter = new Converter();
		assertEquals("XCI", converter.convertArabicNumberIntoRomanNUmeral(91));
		assertEquals("XCIX", converter.convertArabicNumberIntoRomanNUmeral(99));
		assertEquals("C", converter.convertArabicNumberIntoRomanNUmeral(100));
		assertEquals("CXVIII", converter.convertArabicNumberIntoRomanNUmeral(118));
		assertEquals("CXXVII", converter.convertArabicNumberIntoRomanNUmeral(127));
		assertEquals("CXXXIX", converter.convertArabicNumberIntoRomanNUmeral(139));
	}
	
	@Test
	public void testConvertnumbersBetween140and200IntoRomanNumeral() throws Exception {
		Converter converter = new Converter();
		assertEquals("CXL", converter.convertArabicNumberIntoRomanNUmeral(140));
		assertEquals("CL", converter.convertArabicNumberIntoRomanNUmeral(150));
		assertEquals("CLXV", converter.convertArabicNumberIntoRomanNUmeral(165));
		assertEquals("CLXXIX", converter.convertArabicNumberIntoRomanNUmeral(179));
		assertEquals("CLXXXIV", converter.convertArabicNumberIntoRomanNUmeral(184));
		assertEquals("CLXXXIX", converter.convertArabicNumberIntoRomanNUmeral(189));
		assertEquals("CC", converter.convertArabicNumberIntoRomanNUmeral(200));
	}
	
	
	@Test
	public void testConvertnumbersBetween200and400IntoRomanNumeral() throws Exception {
		Converter converter = new Converter();
		assertEquals("CCXLVIII", converter.convertArabicNumberIntoRomanNUmeral(248));
		assertEquals("CCXCI", converter.convertArabicNumberIntoRomanNUmeral(291));
		assertEquals("CCCXLV", converter.convertArabicNumberIntoRomanNUmeral(345));
		assertEquals("CCCLXXXIX", converter.convertArabicNumberIntoRomanNUmeral(389));
		}
	
	
	@Test
	public void testConvertnumbersBetween400and899IntoRomanNumeral() throws Exception {
		Converter converter = new Converter();
		assertEquals("CD", converter.convertArabicNumberIntoRomanNUmeral(400));
		assertEquals("D", converter.convertArabicNumberIntoRomanNUmeral(500));
		assertEquals("DXLIX", converter.convertArabicNumberIntoRomanNUmeral(549));
		assertEquals("DCLXXXIX", converter.convertArabicNumberIntoRomanNUmeral(689));
		assertEquals("DCCXV", converter.convertArabicNumberIntoRomanNUmeral(715));
		assertEquals("DCCCXCIX", converter.convertArabicNumberIntoRomanNUmeral(899));
		}
	
	@Test
	public void testConvertnumbersBetween900and3999IntoRomanNumeral() throws Exception {
		Converter converter = new Converter();
		assertEquals("CM", converter.convertArabicNumberIntoRomanNUmeral(900));
		assertEquals("CMXLIX", converter.convertArabicNumberIntoRomanNUmeral(949));
		assertEquals("M", converter.convertArabicNumberIntoRomanNUmeral(1000));
		assertEquals("MDLXXXIX", converter.convertArabicNumberIntoRomanNUmeral(1589));
		assertEquals("MDCCCXCVI", converter.convertArabicNumberIntoRomanNUmeral(1896));
		assertEquals("MM", converter.convertArabicNumberIntoRomanNUmeral(2000));
		assertEquals("MMCMXCIX", converter.convertArabicNumberIntoRomanNUmeral(2999));
		assertEquals("MMMCCXLVIII", converter.convertArabicNumberIntoRomanNUmeral(3248));
		assertEquals("MMMCMXCIX", converter.convertArabicNumberIntoRomanNUmeral(3999));
		}
	
	@Test
	public void testConverterFromArabicNumberToRomanNumeralHandleNegativeValueOrValueAbove3999() throws Exception {
		Converter converter = new Converter();
		assertEquals("This is not a valid number for roman numeral", converter.convertArabicNumberIntoRomanNUmeral(-1));
		assertEquals("This is not a valid number for roman numeral", converter.convertArabicNumberIntoRomanNUmeral(4000));
		assertEquals("This is not a valid number for roman numeral", converter.convertArabicNumberIntoRomanNUmeral(-2565));
	}
	
	
	@Test
	public void testConvertIIntoArabicNumber() throws Exception {
		Converter converter = new Converter();
		assertEquals(1, converter.convertRomanNumeralIntoArabicNumber("I"));
	}
	
	@Test
	public void testConvertIIIntoArabicNumber() throws Exception {
		Converter converter = new Converter();
		assertEquals(2, converter.convertRomanNumeralIntoArabicNumber("II"));
	}
	
	@Test
	public void testConvertIIIIntoArabicNumber() throws Exception {
		Converter converter = new Converter();
		assertEquals(3, converter.convertRomanNumeralIntoArabicNumber("III"));
	}
	
	@Test
	public void testConvertIVIntoArabicNumber() throws Exception {
		Converter converter = new Converter();
		assertEquals(4, converter.convertRomanNumeralIntoArabicNumber("IV"));
	}
	
	@Test
	public void testConvertVIntoArabicNumber() throws Exception {
		Converter converter = new Converter();
		assertEquals(5, converter.convertRomanNumeralIntoArabicNumber("V"));
	}
	
	@Test
	public void testConvertVIIntoArabicNumber() throws Exception {
		Converter converter = new Converter();
		assertEquals(6, converter.convertRomanNumeralIntoArabicNumber("VI"));
	}
	
	@Test
	public void testConvertVIIIntoArabicNumber() throws Exception {
		Converter converter = new Converter();
		assertEquals(7, converter.convertRomanNumeralIntoArabicNumber("VII"));
	}
	
	@Test
	public void testConvertVIIIIntoArabicNumber() throws Exception {
		Converter converter = new Converter();
		assertEquals(8, converter.convertRomanNumeralIntoArabicNumber("VIII"));
	}
	
	@Test
	public void testConvertIXIntoArabicNumber() throws Exception {
		Converter converter = new Converter();
		assertEquals(9, converter.convertRomanNumeralIntoArabicNumber("IX"));
	}
	
	@Test
	public void testConvertXIntoArabicNumber() throws Exception {
		Converter converter = new Converter();
		assertEquals(10, converter.convertRomanNumeralIntoArabicNumber("X"));
	}
	@Test
	public void testConvertRomanNumeralBetween11and39ntoArabicNumber() throws Exception {
		Converter converter = new Converter();
		assertEquals(12, converter.convertRomanNumeralIntoArabicNumber("XII"));
		assertEquals(20, converter.convertRomanNumeralIntoArabicNumber("XX"));
		assertEquals(25, converter.convertRomanNumeralIntoArabicNumber("XXV"));
		assertEquals(28, converter.convertRomanNumeralIntoArabicNumber("XXVIII"));
		assertEquals(39, converter.convertRomanNumeralIntoArabicNumber("XXXIX"));
	}
	
	@Test
	public void testConvertRomanNumeralBetween39and89ntoArabicNumber() throws Exception {
		Converter converter = new Converter();
		assertEquals(40, converter.convertRomanNumeralIntoArabicNumber("XL"));
		assertEquals(46, converter.convertRomanNumeralIntoArabicNumber("XLVI"));
		assertEquals(50, converter.convertRomanNumeralIntoArabicNumber("L"));
		assertEquals(55, converter.convertRomanNumeralIntoArabicNumber("LV"));
		assertEquals(69, converter.convertRomanNumeralIntoArabicNumber("LXIX"));
		assertEquals(72, converter.convertRomanNumeralIntoArabicNumber("LXXII"));
		assertEquals(89, converter.convertRomanNumeralIntoArabicNumber("LXXXIX"));
	}
	
	@Test
	public void testConvertRomanNumeralBetween90and399ntoArabicNumber() throws Exception {
		Converter converter = new Converter();
		assertEquals(90, converter.convertRomanNumeralIntoArabicNumber("XC"));
		assertEquals(100, converter.convertRomanNumeralIntoArabicNumber("C"));
		assertEquals(128, converter.convertRomanNumeralIntoArabicNumber("CXXVIII"));
		assertEquals(298, converter.convertRomanNumeralIntoArabicNumber("CCXCVIII"));
		assertEquals(311, converter.convertRomanNumeralIntoArabicNumber("CCCXI"));
		assertEquals(342, converter.convertRomanNumeralIntoArabicNumber("CCCXLII"));
		assertEquals(399, converter.convertRomanNumeralIntoArabicNumber("CCCXCIX"));
	}
	
	@Test
	public void testConvertRomanNumeralBetween400and899ntoArabicNumber() throws Exception {
		Converter converter = new Converter();
		assertEquals(400, converter.convertRomanNumeralIntoArabicNumber("CD"));
		assertEquals(469, converter.convertRomanNumeralIntoArabicNumber("CDLXIX"));
		assertEquals(500, converter.convertRomanNumeralIntoArabicNumber("D"));
		assertEquals(542, converter.convertRomanNumeralIntoArabicNumber("DXLII"));
		assertEquals(647, converter.convertRomanNumeralIntoArabicNumber("DCXLVII"));
		assertEquals(713, converter.convertRomanNumeralIntoArabicNumber("DCCXIII"));
		assertEquals(844, converter.convertRomanNumeralIntoArabicNumber("DCCCXLIV"));
		assertEquals(899, converter.convertRomanNumeralIntoArabicNumber("DCCCXCIX"));
	}
	
	@Test
	public void testConvertRomanNumeralBetween900and3999ntoArabicNumber() throws Exception {
		Converter converter = new Converter();
		assertEquals(900, converter.convertRomanNumeralIntoArabicNumber("CM"));
		assertEquals(953, converter.convertRomanNumeralIntoArabicNumber("CMLIII"));
		assertEquals(1000, converter.convertRomanNumeralIntoArabicNumber("M"));
		assertEquals(1287, converter.convertRomanNumeralIntoArabicNumber("MCCLXXXVII"));
		assertEquals(1697, converter.convertRomanNumeralIntoArabicNumber("MDCXCVII"));
		assertEquals(1999, converter.convertRomanNumeralIntoArabicNumber("MCMXCIX"));
		assertEquals(2000, converter.convertRomanNumeralIntoArabicNumber("MM"));
		assertEquals(2687, converter.convertRomanNumeralIntoArabicNumber("MMDCLXXXVII"));
		assertEquals(3158, converter.convertRomanNumeralIntoArabicNumber("MMMCLVIII"));
		assertEquals(3668, converter.convertRomanNumeralIntoArabicNumber("MMMDCLXVIII"));
		assertEquals(3999, converter.convertRomanNumeralIntoArabicNumber("MMMCMXCIX"));
	}
	
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void testThrowExceptionIfStringIsNotRomanNumeralAndOnly1Character() throws NotRomanException{
		thrown.expect(NotRomanException.class);
		thrown.expectMessage("This is not a Roman numeral");
		
		Converter converter = new Converter();
		converter.convertRomanNumeralIntoArabicNumber("Z");
	}
	
	@Test
	public void testThrowExceptionIfStringIsNotRomanNumeral() throws NotRomanException{
		thrown.expect(NotRomanException.class);
		thrown.expectMessage("This is not a Roman numeral");
		
		Converter converter = new Converter();
		converter.convertRomanNumeralIntoArabicNumber("JGH");
	}
	
	@Test
	public void testThrowExceptionIfStringIsNotRomanNumeralBecauseStringIsrepeated4times() throws NotRomanException{
		thrown.expect(NotRomanException.class);
		thrown.expectMessage("This is not a Roman numeral");
		
		Converter converter = new Converter();
		converter.convertRomanNumeralIntoArabicNumber("IIII");
	}
	
	@Test
	public void testThrowExceptionIfStringIsNotRomanNumeralBecauseCIsRepeated4times() throws NotRomanException{
		thrown.expect(NotRomanException.class);
		thrown.expectMessage("This is not a Roman numeral");
		
		Converter converter = new Converter();
		converter.convertRomanNumeralIntoArabicNumber("XXCCCCV");
	}
	
	@Test
	public void testThrowExceptionIfStringIsNotRomanNumeralBecauseBecauseMIsRepeated4times() throws NotRomanException{
		thrown.expect(NotRomanException.class);
		thrown.expectMessage("This is not a Roman numeral");
		
		Converter converter = new Converter();
		converter.convertRomanNumeralIntoArabicNumber("MMMMV");
	}
	
	@Test
	public void testThrowExceptionIfStringIsNotRomanNumeralBecauseVIsRepeated() throws NotRomanException{
		thrown.expect(NotRomanException.class);
		thrown.expectMessage("This is not a Roman numeral");
		
		Converter converter = new Converter();
		converter.convertRomanNumeralIntoArabicNumber("CCXXVV");
	}
	
	@Test
	public void testThrowExceptionIfStringIsNotRomanNumeralBecauseLIsRepeated() throws NotRomanException{
		thrown.expect(NotRomanException.class);
		thrown.expectMessage("This is not a Roman numeral");
		
		Converter converter = new Converter();
		converter.convertRomanNumeralIntoArabicNumber("CLLXIV");
	}
	
	@Test
	public void testThrowExceptionIfStringIsNotRomanNumeralBecauseDIsRepeated() throws NotRomanException{
		thrown.expect(NotRomanException.class);
		thrown.expectMessage("This is not a Roman numeral");
		
		Converter converter = new Converter();
		converter.convertRomanNumeralIntoArabicNumber("CDDXV");
	}
	
	@Test
	public void testThrowExceptionIfStringIsNotRomanNumeralBecauseHundredAreBeforeThousand() throws NotRomanException{
		thrown.expect(NotRomanException.class);
		thrown.expectMessage("This is not a Roman numeral");
		
		Converter converter = new Converter();
		converter.convertRomanNumeralIntoArabicNumber("CCCMM");
	}
	
	@Test
	public void testThrowExceptionIfStringIsNotRomanNumeralBecauseTensAreMissPlaced() throws NotRomanException{
		thrown.expect(NotRomanException.class);
		thrown.expectMessage("This is not a Roman numeral");
		
		Converter converter = new Converter();
		converter.convertRomanNumeralIntoArabicNumber("MMMXXCCLV");
	}
	
	@Test
	public void testThrowExceptionIfStringIsNotRomanNumeralBecauseOnesAreMissPlaced() throws NotRomanException{
		thrown.expect(NotRomanException.class);
		thrown.expectMessage("This is not a Roman numeral");
		
		Converter converter = new Converter();
		converter.convertRomanNumeralIntoArabicNumber("IICCCLX");
	}
	
	@Test
	public void testThrowExceptionIfStringIsNotRomanNumeralBecauseVIsRepeatedMoreThanOnce() throws NotRomanException{
		thrown.expect(NotRomanException.class);
		thrown.expectMessage("This is not a Roman numeral");
		
		Converter converter = new Converter();
		converter.convertRomanNumeralIntoArabicNumber("CCLVXV");
	}
	
	@Test
	public void testThrowExceptionIfStringIsNotRomanNumeralBecauseLIsRepeatedMoreThanOnce() throws NotRomanException{
		thrown.expect(NotRomanException.class);
		thrown.expectMessage("This is not a Roman numeral");
		
		Converter converter = new Converter();
		converter.convertRomanNumeralIntoArabicNumber("CLCLXV");
	}
}
