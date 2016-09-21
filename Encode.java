
public class Encode {
	
	/*
	 * Caesar Cipher - the first known cryptography
	 * To code:
	 * 
	 * 1. Determine a key -- an int used to 0ffset letters in the alpha
	 * 2. Take each char in your plain text msg, add the offset key to get 
	 * the coded msg
	 * for example: key = 2, plain txt is "abc" then coded msg "cdf"
	 * To decode the msg, just subtract 2 from the coded msg
	 * 
	 */
	
	public static void main (String[] args){
		
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		int key = 5;
		
		String plainTxt = "hello";
		String codedTxt = "";
		char shiftedAlpha = ' ';
		int alphaIndex = 0;
		
		plainTxt = plainTxt.toLowerCase();
		//System.out.println(plainTxt);
	for (int i = 0; i < plainTxt.length(); i++){
	
	
		//System.out.println("first leter of " + plainTxt + " is: " + plainTxt.charAt(i));
		//System.out.println("the alpha index of above is " + alpha.indexOf(plainTxt.charAt(i)));
		alphaIndex = alpha.indexOf(plainTxt.charAt(i));
		shiftedAlpha = alpha.charAt(alphaIndex + key);
		//System.out.println("Shifted alpha is " + shiftedAlpha);
		codedTxt = codedTxt + shiftedAlpha;
		
		if (i > 26) {
			 shiftedAlpha = (char) (i - 26);
		}
		if else (i )
	}
	System.out.println("Plain text message was:" + plainTxt);
	System.out.println("Using this key: " + key);
	System.out.println("results in this coded message: " + codedTxt);
		
	
	
	}

}
