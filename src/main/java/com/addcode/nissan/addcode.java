package com.addcode.nissan;

import java.io.PrintWriter;

public class addcode {
    
	public String func(String n1,String n2){
		
		Double num1 = 0.0,num2 = 0.0;
		boolean numeric=true;
		 try {
	             num1 = Double.parseDouble(n1);
	        } catch (NumberFormatException e) {
	            numeric = false;
	        }
		 try {
	           num2 = Double.parseDouble(n2);
	        } catch (NumberFormatException e) {
	            numeric = false;
	        }
		if(!numeric){
			return "Invalid";
		}
		else{
			return Double.toString(num1+num2);
		}
		
	}
}
