package funktionenHandler;

import java.util.ArrayList;

public class FunktionsTyp 
{
	private String[] möglicheFunktionen = {"sin", "cos", "tan", "log", "ln", "exp"};
	private String typ; 
	
	public FunktionsTyp(String typ)
	{
		this.typ = typ;		
	}

	
	public double calc(double innererWert)
	{

		 switch(typ)
		 {
	        case "sin":
	        	return Math.sin(innererWert);
	        case "cos":
	            return Math.cos(innererWert);
	        case "tan":
	            return Math.tan(innererWert);
	        case "log":
	            return Math.log10(innererWert);
	        case "ln" :
	        	return Math.log(innererWert);
	        case "exp":
	        	return Math.exp(innererWert);
	        default:
	        	System.out.println("Fehler bei FunktionsTyp");
	            return 0;
		
		 }
	}


	public static FunktionsTyp findeTyp(String string) {
		// TODO Auto-generated method stub
		return null;
	}


	public static String findeInnerenWert(String string) {
		// TODO Auto-generated method stub
		return null;
	}


	public static ArrayList<String> findeFunktionen(ArrayList<String> stringListe) {
		// TODO Auto-generated method stub
		return stringListe;
	}
	
	
	
}
