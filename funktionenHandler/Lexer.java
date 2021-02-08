package funktionenHandler;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Lexer {
	
	
	static ArrayList<String> lexen(String fun)
	{
		
		ArrayList<String> stringListe = new ArrayList<>();
		
		
		//String in Chars umwandlen
		ArrayList<Character> chars = (ArrayList<Character>) fun
																.chars()
			    												.mapToObj(e->(char)e)
			    												.collect(Collectors.toList());
		
		//Leerzeichen entfernen
		for(int i = chars.size() - 1; i >= 0; i--)
		{
			
			if(chars.get(i) == ' ')
				chars.remove(i);
			
		}
		
		
		//Zahlen zusammenfassen und alles in Strings darstellen
		for(int i = 0; i < chars.size(); i++)
		{
			
			String s = String.valueOf(chars.get(i));
			if(!isZahl(chars.get(i))) 
			{
				stringListe.add(s);
				continue;
			}
			i++;
			while(i < chars.size() && (isZahl(chars.get(i)) || chars.get(i) == '.'))
			{
				s = s + String.valueOf(chars.get(i));
				i++;
			}
			
			
			stringListe.add(s);
			i--;
		}
		
			
		
		return stringListe;
		
	}
	
	/*
	 * Chechen, ob ein Char eine Zahl ist
	 */
	static boolean isZahl(char c)
	{
		try {
		Double.parseDouble(String.valueOf(c));
		}
		catch(Exception e)
		{
			return false;			
		}
		
		return true;
	}

}
