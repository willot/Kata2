import java.util.Arrays;
import java.util.HashMap;

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
				romanNumeral = matchingRomanNumeralToArabicNumberFromArrayReference;
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


	public int converterRomanNUmeralIntoArabicNumber(String romanNumber) {
		int arabicNumber =0;
		int lengthOfString = romanNumber.length();
		
		HashMap<String, Integer> romanToArabicValue = new HashMap<String, Integer>();
		romanToArabicValue.put("I",1);
		romanToArabicValue.put("IV",4);
		romanToArabicValue.put("V",5);
		romanToArabicValue.put("IX",9);
		romanToArabicValue.put("X",10);
		romanToArabicValue.put("XL",40);
		romanToArabicValue.put("L",50);
		
		if(lengthOfString == 1){
			arabicNumber =romanToArabicValue.get(romanNumber);
		}
		else{
			String[] splitRomanNumeral = romanNumber.split("");
			
			while (splitRomanNumeral.length >0) {
				
				if( splitRomanNumeral.length == 1 ) {
					arabicNumber += romanToArabicValue.get(splitRomanNumeral[0]);
					return arabicNumber;
				}
				
				if(romanToArabicValue.get(splitRomanNumeral[0]) < romanToArabicValue.get(splitRomanNumeral[1])) {
					arabicNumber += romanToArabicValue.get(splitRomanNumeral[0] + splitRomanNumeral[1]);
					splitRomanNumeral = Arrays.copyOfRange(splitRomanNumeral,2,splitRomanNumeral.length);
				}
				
				else {arabicNumber += romanToArabicValue.get(splitRomanNumeral[0]);
				splitRomanNumeral = Arrays.copyOfRange(splitRomanNumeral,1,splitRomanNumeral.length);
				}
				
			}
			
			
		}
		
		return arabicNumber;
	}

}
