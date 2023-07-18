package com.obsqura.testscripts;

import org.testng.annotations.Test;

import com.obsqura.utilities.StringUtlity;
  @Test
	public class StringUtilityChecking {

		public void strUtilityCheck() {
			StringUtlity su = new StringUtlity();
			int l = su.stringIength();
			System.out.println(l);
			char ch = su.charactor();
			System.out.println(ch);
			String s1 = su.concatString();
			System.out.println(s1);
			boolean b1 = su.stringEquals();
			System.out.println(b1);
			boolean b2 = su.stringEqualIgnore();
			System.out.println(b2);
			String s2 = su.returnUpperCase();
			System.out.println(s2);
			String  s3=su.returnlowerCase();
			System.out.println(s3);
			String s4=su.replaceLetter();
			System.out.println(s4);
		 
		
	
	}
	    
	
	
	

}
