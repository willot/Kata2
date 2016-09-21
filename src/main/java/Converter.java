import java.util.Arrays;
import java.util.HashMap;

public class Converter {
	
	private String[] romanNumberReference= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	private Integer[] arabicNumberReferences= {1000,900,500,400,100,90,50,40,10,9,5,4,1};

	public String converterArabicNumberIntoRomanNUmeral(int arabicNumber) {
		 int remainingOfArabicNumber = arabicNumber;
		 String romanNumeral = "";
		 
		if (isArabicNumberConvertibleIntoRomanNumeral(arabicNumber)){
			return "This is not a valid number for roman numeral";
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
				remainingOfArabicNumber -= quotientOfArabicNumber*arabicNumberFromArrayReference;
				romanNumeral = romanNumeral + new String(new char[quotientOfArabicNumber]).replace("\0", matchingRomanNumeralToArabicNumberFromArrayReference);	
			}
					
			if(remainingOfArabicNumber== 0){
				return romanNumeral;
			}
		}
		 return romanNumeral;
	}

	
	private Boolean isArabicNumberConvertibleIntoRomanNumeral(int arabicNumber) {
		if(arabicNumber < 0 || arabicNumber >3999){
			return true;
		}
		return false;
	}


	public int converterRomanNUmeralIntoArabicNumber(String romanNumber) {
		int arabicNumber =0;
		HashMap<String, Integer> romanToArabicValue = createRomanToArabicValueHash();
		String[] splitRomanNumeral = romanNumber.split("");
		
		if (!isRomanNumberARealRomanNumeral(romanToArabicValue, splitRomanNumeral)){
			return arabicNumber;
		}

		else if(isLengthOfRomanNumberEqualToOne(romanNumber)){
			return romanToArabicValue.get(romanNumber);
		}
		
		else{
			while (splitRomanNumeral.length >0) {
				
				if( splitRomanNumeral.length == 1 ) {
					arabicNumber += romanToArabicValue.get(splitRomanNumeral[0]);
					return arabicNumber;
				}
				
				if(romanToArabicValue.get(splitRomanNumeral[0]) < romanToArabicValue.get(splitRomanNumeral[1])) {
					arabicNumber += romanToArabicValue.get(splitRomanNumeral[0] + splitRomanNumeral[1]);
					splitRomanNumeral = createNewArrayOfSmallerSize(splitRomanNumeral,2);
				}
				
				else {arabicNumber += romanToArabicValue.get(splitRomanNumeral[0]);
				splitRomanNumeral = createNewArrayOfSmallerSize(splitRomanNumeral,1);
				}
			}
		}
		return arabicNumber;
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


	private boolean isRomanNumberARealRomanNumeral(HashMap<String, Integer> romanToArabicValue, String[] splitRomanNumeral) {
		for (int index = 0; index < splitRomanNumeral.length; index++) {
			if (romanToArabicValue.get(splitRomanNumeral[index]) == null) {
				return false;
			}
		}
		return true;
	}


	private HashMap<String, Integer> createRomanToArabicValueHash() {
		HashMap<String, Integer> romanToArabicValue = new HashMap<String, Integer>();
		romanToArabicValue.put("I",1);
		romanToArabicValue.put("IV",4);
		romanToArabicValue.put("V",5);
		romanToArabicValue.put("IX",9);
		romanToArabicValue.put("X",10);
		romanToArabicValue.put("XL",40);
		romanToArabicValue.put("L",50);
		romanToArabicValue.put("XC",90);
		romanToArabicValue.put("C",100);
		romanToArabicValue.put("CD",400);
		romanToArabicValue.put("D",500);
		romanToArabicValue.put("CM",900);
		romanToArabicValue.put("M",1000);
		return romanToArabicValue;
	}

}
