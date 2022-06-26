package com.gl.service;

public class CredentialService {
	
	public	char[] generatePassword()
	{
		String capitalLetters = "AAHGHJGHFFDSDFDSKG";
		String smallLetters = "dshajdsajssdaj";
		String numbers ="548575884";
		String specialchar= "#@$#$%^^*()(()&^%$";
		
	
		
		String mydata= capitalLetters + smallLetters;
		
		
		char[] password= new char[8];
		Random random= new Random();
		for(int i=0; i<8;i++)
		password[i]=  mydata.charAt(random.nextInt(mydata.length())
		
				
				
	}
	public String generateEmail(String firstName, String lastName, String department)
	{
      String generatedEmail;
      generatedEmail = firstName+lastName+"."+department+"@abc.com";
      		return generatedEmail;
}
 syso
