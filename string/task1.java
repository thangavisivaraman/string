package string;

public class task1 {


		    public static void main(String[] args) {
		        String inputString = "Aa#1bC&d2E@f3GhIiJkLmNoPqRs4tUv5WxYz6";

		        String uppercaseLetters = "";
		        String lowercaseLetters = "";
		        String numbers = "";
		        String specialCharacters = "";

		        for (char c : inputString.toCharArray()) {
		            if (Character.isUpperCase(c)) {
		                uppercaseLetters += c;
		            } else if (Character.isLowerCase(c)) {
		                lowercaseLetters += c;
		            } else if (Character.isDigit(c)) {
		                numbers += c;
		            } else {
		                specialCharacters += c;
		            }
		        }

		        System.out.println("Uppercase Letters: " + uppercaseLetters);
		        System.out.println("Lowercase Letters: " + lowercaseLetters);
		        System.out.println("Numbers: " + numbers);
		        System.out.println("Special Characters: " + specialCharacters);
		    }
		}


