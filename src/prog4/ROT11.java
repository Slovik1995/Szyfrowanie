package prog4;

import java.io.File;

public class ROT11 implements Algorithm{
	private final static String alphabet= "abcdefghijklmnopqrstuvwxyz";
	private final static String alphabet2="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	private final static int rot=13;
	public String crypt(String word){
		String decWord="";
		for(int i=0; i<word.length(); i++)
		{
			char lit = word.charAt(i);
			int index = alphabet.indexOf(lit);
			if(index!=-1)
			{
				index=(index+rot)%alphabet.length();
				decWord=decWord+alphabet.charAt(index);
			}
			else
			{
				index = alphabet2.indexOf(lit);
				index=(index+rot)%alphabet2.length();
				decWord=decWord+alphabet2.charAt(index);
			}
		}
		return decWord;
	};
	public String decrypt(String word){
		return crypt(word);
	};
	
}
