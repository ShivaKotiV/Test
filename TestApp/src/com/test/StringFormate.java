package com.test;

public class StringFormate {
	/**
	* @param args
	*/
	public static void main(String[] args) {
	String str="bUx11HelloaUx11";
	boolean goodString= isGoodString(str);


	if(goodString){
	System.out.println("Given String is good String");
	}else{
	System.out.println("Given String is not a good String");
	}
	}
	 /*A string is good if the following conditions are met.

	 The number of words in string should be greater than two.
	 The character 'A' should not appear in the string more than 3 times.
	 The character with which the string starts should not appear again in that string.
	 There should be no digits in the string unless the string (but see next conditon)
	 If there are any digits in the string, they must occur in groups of two and preceeded by Ux. 
	 For exampe "Ux00Hello" satisfies this condition, but "Hi123" and "Ux123" does not satisfy.
	 Write a method: */

	public static boolean isGoodString(String str){

	//boolean goodString=false;
	int charACount=0;
	Character startingChar=str.charAt(0);
	int staringCharCOunt=0;
	String preccedChar="Ux";
	boolean checking=false;
	int checkingCount=0;
	if(str.length()>2){
	for (int i = 0; i < str.length(); i++) {

	if(startingChar==str.charAt(i)){
	staringCharCOunt++;
	}

	if (str.charAt(i) == 'A') {
	charACount++;
	}
	//condition three
	if(Character.isDigit(str.charAt(i))){
	if(i+1<str.length()){
	if(Character.isDigit(str.charAt(i+1)) ){
	if( (str.charAt(i)==str.charAt(i+1))){

	String inputString=String.valueOf(str.charAt(i-2))+String.valueOf(str.charAt(i-1));
	if(!preccedChar.equalsIgnoreCase(inputString)){
	return false;
	}
	}else{
	checkingCount++;
	}
	}
	}
	}
	}

	//condition 1
	if(charACount>3){
	return false;
	}else
	if(staringCharCOunt>1){
	return false;
	}
	else if(checkingCount>=1){
	return false;
	}
	else{
	return true;
	}


	}else{
	return false;
	}


	//return goodString;
	}
	}

