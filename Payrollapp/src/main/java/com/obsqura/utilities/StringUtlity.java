package com.obsqura.utilities;

public class StringUtlity {

	String s = "Hello World";
	String str = "Welcome ";

	public int stringIength() {
		return s.length();
	}

	public char charactor() {
		return s.charAt(2);
	}

	public String concatString() {
		return s.concat(str);
    }

	public boolean stringEquals() {
		return s.equals(str);
	}

	public boolean stringEqualIgnore() {
		return s.equalsIgnoreCase(str);

	}
	public String returnUpperCase() {
		return s.toUpperCase();
	}
	public String returnlowerCase () {
		return s.toLowerCase();
    }
	public String replaceLetter() {
		return s.replace('H','M');
		
	}
	public boolean textCheck(String actualText,String expectedText) {
		if(actualText.equalsIgnoreCase(expectedText)) {
			return(true);
		}
		return(false);
	}
		
		
	}
	
