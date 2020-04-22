package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String funk = "";
		String temp = "";
		boolean swap = true;
		for (int i = 0; i < s.length(); i++) {
			temp = s.charAt(i) + "";
			if(swap == false) {
				funk += temp.toUpperCase();
				swap = true;
			}
			else if(swap == true) {
				funk += temp.toLowerCase();
				swap = false;
			}
		}
		return funk;
	}

}
