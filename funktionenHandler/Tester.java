package funktionenHandler;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
		
		System.out.println(lexerTest());
	
		System.out.println(Lexer.lexen("4*sin(4x)"));
	}
	
	
	public static boolean lexerTest()
	{
		String s = "4 * x ^ 3 + (3 + x)^2 * 3";
		
		ArrayList<String> gelext = Lexer.lexen(s);
		
		String[] as = {"4","*","x","^", "3", "+", "(","3","+","x", ")", "^", "2", "*", "3"};
		
		List<String> test = Arrays.asList(as);
		
		if(gelext.equals(test)) return true;
		return false;
		
		
		
	}
}
