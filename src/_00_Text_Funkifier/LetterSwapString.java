package _00_Text_Funkifier;

public class LetterSwapString extends SpecialString{

	public LetterSwapString(String s) {
		super(s);
	}
/// t->g o->~ h->p 
	@Override
	public String funkifyText(String s) {
		String funk = "";
		for (int i = 0; i < s.length(); i++) {
			String temp = s.charAt(i)+"";
			if(temp.equals("t")) {
				temp = "g";
			}
			else if(temp.equals("T")) {
				temp = "G";
			}
			else if(temp.equals("o")) {
				temp = "~";
			}
			else if(temp.equals("O")) {
				temp = "~";
			}
			else if(temp.equals("h")) {
				temp = "p";
			}
			else if(temp.equals("H")) {
				temp = "P";
			}
			funk += temp;
		}
		return funk;
	}
	
}
