
public class Converter {
	
	private String[] romanNumberReference= {"V","IV","I"};
	private Integer[] arabicNumberReferences= {5,4,1};

	public String converterArabicNumberIntoRomanNUmeral(int arabicNumber) {
		 int remainingOfArabicNumber = arabicNumber;
		 String romanNumeral = "";
		
	for (int index = 0; index < arabicNumberReferences.length; index++) {
		
		int arabicNumberFromArrayReference = arabicNumberReferences[index];
				
				if(arabicNumber == arabicNumberFromArrayReference ) {
					System.out.println("HERE");
					 romanNumeral = romanNumberReference[index];
					return romanNumeral;
				}
				
				
				int quotientOfArabicNumber = remainingOfArabicNumber/arabicNumberFromArrayReference;

				 if (quotientOfArabicNumber>0) {
					 System.out.println("HERE");
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
