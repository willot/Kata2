
public class Converter {
	
	private String[] romanNumberReference= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	private Integer[] arabicNumberReferences= {1000,900,500,400,100,90,50,40,10,9,5,4,1};

	public String converterArabicNumberIntoRomanNUmeral(int arabicNumber) {
		 int remainingOfArabicNumber = arabicNumber;
		 String romanNumeral = "";
		
	for (int index = 0; index < arabicNumberReferences.length; index++) {
		int arabicNumberFromArrayReference = arabicNumberReferences[index];
				
		if(arabicNumber == arabicNumberFromArrayReference ) {
			romanNumeral = romanNumberReference[index];
			return romanNumeral;
		}
				
				
		int quotientOfArabicNumber = remainingOfArabicNumber/arabicNumberFromArrayReference;

		if (quotientOfArabicNumber>0) {
			 while (quotientOfArabicNumber >0) {
				quotientOfArabicNumber --;
				romanNumeral += romanNumberReference[index];
				remainingOfArabicNumber = remainingOfArabicNumber - arabicNumberFromArrayReference;
			}
		}
				
		if(remainingOfArabicNumber== 0){
			return romanNumeral;
		}
				
					
	}
	 return romanNumeral;
	

	}

}
