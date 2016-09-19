
public class Converter {
	
	private String[] romanNumberReference= {"IX","V","IV","I"};
	private Integer[] arabicNumberReferences= {9,5,4,1};

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
				
				
					
	}
	 return romanNumeral;
	

	}

}
