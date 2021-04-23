package day11.demo3;

public class MyStringUtils {

	public String cipherShiftByOne(String input) {
		// a -> b
		String output = "";
		for(char ch : input.toCharArray()) {
			 char ciphered = (char)(ch + 1);
			 output += ciphered;
		}
		
		return output;
	}

	public boolean validateMobileNumberLength(String input) {
		// TODO Auto-generated method stub
		return input.length() == 10 ? true : false;
	}

}
