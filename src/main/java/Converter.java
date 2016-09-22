import java.util.Arrays;
import java.util.HashMap;


public class Converter {
	
	private String[] romanNumberReference= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	private Integer[] arabicNumberReferences= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	private HashMap<String, Integer> romanToArabicValueHash = createRomanToArabicValueHash();
	

	public String convertArabicNumberIntoRomanNUmeral(int arabicNumberToConvert) {
		 int arabicNumberRemainder = arabicNumberToConvert;
		 String romanNumeral = "";
		 
		if (isNumberConvertibleIntoRomanNumeral(arabicNumberToConvert)){
			return "This is not a valid number for roman numeral";
		}
		
		for (int index = 0; index < arabicNumberReferences.length; index++) {
			int arabicNumberFromArrayReference = arabicNumberReferences[index];
			String matchingRomanNumeralToArabicNumberFromArrayReference = romanNumberReference[index];
					
			if(arabicNumberToConvert == arabicNumberFromArrayReference ) {
				return matchingRomanNumeralToArabicNumberFromArrayReference;
			}
					
			int quotientOfArabicNumber = arabicNumberRemainder/arabicNumberFromArrayReference;
	
			if (quotientOfArabicNumber>0) {
				arabicNumberRemainder -= quotientOfArabicNumber*arabicNumberFromArrayReference;
				romanNumeral += repeatStringXtimes(matchingRomanNumeralToArabicNumberFromArrayReference,
						quotientOfArabicNumber);
			}
					
			if(arabicNumberRemainder== 0){
				return romanNumeral;
			}
		}
		 return romanNumeral;
	}


		public int convertRomanNumeralIntoArabicNumber(String romanNumberToConvert) {
		int arabicNumber =0;
		String[] splitRomanNumeralToConvert = romanNumberToConvert.split("");
		
		if (!isRomanNumberARealRomanNumeral(splitRomanNumeralToConvert)){
			return arabicNumber;
		}

		else if(isLengthOfRomanNumberEqualToOne(romanNumberToConvert)){
			return matchingArabicNumber(romanNumberToConvert);
		}
		
		else{
			while (splitRomanNumeralToConvert.length >0) {
				String firstLetterToConvert = splitRomanNumeralToConvert[0];
				if( splitRomanNumeralToConvert.length == 1 ) {
					arabicNumber += matchingArabicNumber(firstLetterToConvert);
					return arabicNumber;
				}
				String secondLetterToConvert = splitRomanNumeralToConvert[1];
				
				if(matchingArabicNumber(firstLetterToConvert) < matchingArabicNumber(secondLetterToConvert)) {
					arabicNumber += matchingArabicNumber(secondLetterToConvert) - matchingArabicNumber(firstLetterToConvert);
					splitRomanNumeralToConvert = createNewArrayOfSmallerSize(splitRomanNumeralToConvert,2);
				}
				
				else {arabicNumber += matchingArabicNumber(firstLetterToConvert);
				splitRomanNumeralToConvert = createNewArrayOfSmallerSize(splitRomanNumeralToConvert,1);
				}
			}
			return arabicNumber;
		}
	}
		
	private String repeatStringXtimes(String stringToRepeat, int numberOfTimeTheStringIsAppended) {
			return new String(new char[numberOfTimeTheStringIsAppended]).replace("\0", stringToRepeat);
	}

		
	private Boolean isNumberConvertibleIntoRomanNumeral(int arabicNumber) {
		if(arabicNumber < 0 || arabicNumber >3999){
			return true;
		}
		return false;
	}
		
	private Integer matchingArabicNumber(String romanNumeral) {
		return romanToArabicValueHash.get(romanNumeral);
	}


	private boolean isLengthOfRomanNumberEqualToOne(String romanNumber) {
		if (romanNumber.length() == 1){
			return true;
		}
		return false;
	}


	private String[] createNewArrayOfSmallerSize(String[] oldArray, int indexWhereNewArrayStart) {
		return Arrays.copyOfRange(oldArray,indexWhereNewArrayStart,oldArray.length);
	}


	private boolean isRomanNumberARealRomanNumeral( String[] splitRomanNumeral) {
		for (int index = 0; index < splitRomanNumeral.length; index++) {
			if (romanToArabicValueHash.get(splitRomanNumeral[index]) == null) {
				return false;
			}
		}
		return true;
	}


	private HashMap<String, Integer> createRomanToArabicValueHash() {
		romanToArabicValueHash = new HashMap<String, Integer>();
		romanToArabicValueHash.put("I",1);
		romanToArabicValueHash.put("V",5);
		romanToArabicValueHash.put("X",10);
		romanToArabicValueHash.put("L",50);
		romanToArabicValueHash.put("C",100);
		romanToArabicValueHash.put("D",500);
		romanToArabicValueHash.put("M",1000);
		return romanToArabicValueHash;
	}

}
