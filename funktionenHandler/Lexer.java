package funktionenHandler;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Lexer {
	
	
	public static ArrayList<String> lexen(String funktion_String)
	{
			
		
		
		//String in Chars umwandlenn
		ArrayList<Character> charListe = String_to_Chars(funktion_String);
				
		//Leerzeichen entfernen
		removeSpace(charListe);
		
		
		//Zahlen zusammenfassen und alles in Strings darstellen
		ArrayList<String> stringListe = conclude_to_String(charListe);
			
		
		return stringListe;
		
	}
	
	
	public static ArrayList<String> lexenOhneFunktionen(String funktion_String)
	{
			
		
		
		//String in Chars umwandlenn
		ArrayList<Character> charListe = String_to_Chars(funktion_String);
				
		//Leerzeichen entfernen
		removeSpace(charListe);
		
		
		//Zahlen zusammenfassen und alles in Strings darstellen
		ArrayList<String> stringListe = conclude_to_String(charListe);
			
		
		return stringListe;
		
	}
	
	
	
	
	private static ArrayList<String> conclude_to_String(ArrayList<Character> charListe)
	{
		ArrayList<String> stringListe = new ArrayList<>();
		
		for(int i = 0; i < charListe.size(); i++)
		{
			
			String s = String.valueOf(charListe.get(i));
			if(!isDouble(charListe.get(i))) 
			{
				stringListe.add(s);
				continue;
			}
			i++;
			while(i < charListe.size() && (isDouble(charListe.get(i)) || charListe.get(i) == '.'))
			{
				s = s + String.valueOf(charListe.get(i));
				i++;
			}
			
			
			stringListe.add(s);
			i--;
		}
		
		return stringListe;
		
		
	}
	
	
	
	private static void removeSpace(ArrayList<Character> charListe)
	{
		for(int i = charListe.size() - 1; i >= 0; i--)
		{
			
			if(charListe.get(i) == ' ')
				charListe.remove(i);
			
		}
		
		
	}
	
	private static ArrayList<Character> String_to_Chars(String string)
	{
		return (ArrayList<Character>) string
										.chars()
										.mapToObj(e->(char)e)
										.collect(Collectors.toList());
		
	}
	
	
	/*
	 * Chechen, ob ein Char eine Zahl ist
	 */
	public static boolean isDouble(char c)
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
	
	public static boolean isDouble(String s)
	{
		try {
		Double.parseDouble(String.valueOf(s));
		}
		catch(Exception e)
		{
			return false;			
		}
		
		return true;
	}
	

}
