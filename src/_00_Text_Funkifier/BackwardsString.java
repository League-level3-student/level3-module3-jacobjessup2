package _00_Text_Funkifier;

import java.util.Stack;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		Stack<String> backwards = new Stack<String>();
		String back = "";
		for (int i = 0; i < s.length(); i++) {
			backwards.add(s.charAt(i)+"");
			System.out.println(s.charAt(i));
		}
		for (int i = 0; i < s.length(); i++) {
			back += backwards.pop();
		}
		return back;
	}

}
