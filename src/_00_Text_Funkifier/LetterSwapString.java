package _00_Text_Funkifier;

public class LetterSwapString extends SpecialString{

	public LetterSwapString(String s) {
		super(s);
	}
/// tog g~h
	@Override
	public String funkifyText(String s) {
		String funk = "";
		for (int i = 0; i < s.length(); i++) {
			String temp = s.charAt(i)+"";
			if(temp == "t") {
				temp = "g";
			}
			else if(temp == "T") {
				temp = "G";
			}
			else if(temp == "o") {
				temp = "~";
			}
			else if(temp == "O") {
				temp = "~";
			}
			else if(temp == "g") {
				temp = "h";
			}
			else if(temp == "G") {
				temp = "H";
			}
			funk += temp;
		}
		return funk;
	}
	
}
