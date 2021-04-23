package te1.demo1;

public class AppUtils {

	public String greetings() {
		return "helloworld";
	}
	
	public String greetings(String name) {
		return "hello " + name;
	}
	
	public double divide(int n1, int n2) {
		return n1/n2;
	}
	
	public boolean validateMobileNumber(String input) {
		return input.length() == 10?true : false;
	}
	
	public int add(int n1, int n2) {
		return n1+n2;
	}
	
	public String cipherText(String input) {
	
		String output = "";
		for(char ch : input.toCharArray()) {
			char ch1 = (char)(ch + 1);
			output += ch1;
		}
		
		return output;
	}
}
