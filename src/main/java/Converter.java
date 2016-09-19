
public class Converter {

	public String converterArabicNumberIntoRomanNUmeral(int arabicNumber) {
		
		switch (arabicNumber) {
		case 1:
			return "I";
			
			
		case 2:
			return "II";
		
		case 3:
			return "III";
			
		case 4:
			return "IV";

		default:
			break;
		}
		return "I";
	}

}
