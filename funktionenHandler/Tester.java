package funktionenHandler;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		
		String s = "42x^2 + 2";
		 
		System.out.println(Lexer.lexen(s));
		
		
		
		Funktion f = new Funktion("4*x^2 + (3*2)");
		System.out.println(f.berechneFür(2));
	}
}
