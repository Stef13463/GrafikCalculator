package funktionenHandler;

import java.util.ArrayList;

public class Operator 
{
	
	private char charOperator;
	//private char[] zulässigeOperatoren = {'+', '-', '*', '^', '/'}; //+,- = prio 1; */ = prio 2; ^ = prio 3 
	
	//Constructor
	Operator(String charOperator) 
	{	
		
	this.charOperator = charOperator.charAt(0);	
	
	}

	
	double calc(double r1, double r2) 
	{
		
		 switch(charOperator){
	        	case '+':
	            return r1 + r2;
	            
	        	case '-':
	            return r1 - r2;
	            
				case '*':
	            return r1 * r2;
	            
				case '/':
	            return r1/r2;	            
	            
				case '^':					
	        	return  Math.pow(r1, r2);
	        	
	        default:
	            System.out.println("Fehler");
	            break;
	        }
		
		
		
		return 0;
	}
	
	static int findeOperator(ArrayList<String> zeichenListe)
	{
		if(zeichenListe.get(0).equals("(")  && zeichenListe.get(zeichenListe.size()- 1).equals(")"))
		{
			zeichenListe.remove(0);
			zeichenListe.remove(zeichenListe.size()- 1);			
		}
		
	
		boolean klammer = false;
		int prio = 10;
		int pos = -1;
		
		for(int i = 0; i < zeichenListe.size(); i++)
		{
			if(zeichenListe.get(i).equals(")")) 
			{
				klammer = false;
				continue;
			}
			
			if(zeichenListe.get(i).equals("(")) 
			{
				klammer = true;
				continue;
			}
			
			if(klammer == true) continue;
			
			if(getPrio(zeichenListe.get(i)) < prio)
			{
				prio = (getPrio(zeichenListe.get(i)));
				pos = i;
						
			}
			
			
		}
		
		
		
			return pos;
		
	
		
	}
	
	
	
	
	static int getPrio(String e)
	{
		if(e.equals("+")) return 1;
		if(e.equals("-")) return 1;
		if(e.equals("*")) return 2;
		if(e.equals("/")) return 2;
		if(e.equals("^")) return 3;
		
		return 10;
	}
	
	
	
}
