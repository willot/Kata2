
public class Converter {
	
	private String[] romanNumberReference= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	private Integer[] arabicNumberReferences= {1000,900,500,400,100,90,50,40,10,9,5,4,1};

	public String converterArabicNumberIntoRomanNUmeral(int arabicNumber) {
		 int remainingOfArabicNumber = arabicNumber;
		 String romanNumeral = "";
		 
		if (checkIfArabicNumberCanBeConvertedIntoRomanNumeral(arabicNumber)){
			romanNumeral = "This is not a valid number for roman numeral";
			return romanNumeral;
		};
		
		for (int index = 0; index < arabicNumberReferences.length; index++) {
			int arabicNumberFromArrayReference = arabicNumberReferences[index];
			String matchingRomanNumeralToArabicNumberFromArrayReference = romanNumberReference[index];
					
			if(arabicNumber == arabicNumberFromArrayReference ) {
				romanNumeral = romanNumberReference[index];
				
				return romanNumeral;
			}
					
			int quotientOfArabicNumber = remainingOfArabicNumber/arabicNumberFromArrayReference;
	
			if (quotientOfArabicNumber>0) {
				remainingOfArabicNumber = remainingOfArabicNumber -quotientOfArabicNumber*arabicNumberFromArrayReference;
				romanNumeral = romanNumeral + new String(new char[quotientOfArabicNumber]).replace("\0", matchingRomanNumeralToArabicNumberFromArrayReference);	
			}
					
			if(remainingOfArabicNumber== 0){
				return romanNumeral;
			}
		}
		 return romanNumeral;
	}

	
	private Boolean checkIfArabicNumberCanBeConvertedIntoRomanNumeral(int arabicNumber) {
		if(arabicNumber < 0 || arabicNumber >3999){
			return true;
		}
		return false;
	}

}
