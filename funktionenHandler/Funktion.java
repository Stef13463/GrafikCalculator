package funktionenHandler;



public class Funktion
{
	private Baum funktionsBaum;
	private String originalString;
	
	public Funktion(String funktion)
	{
		this.originalString = funktion;
		this.funktionsBaum = Baum.createBaum(Lexer.lexen(funktion));
		
	}
	
	public double berechneFür(double x)
	{
		funktionsBaum.setVar(x);
		return funktionsBaum.getResult();
		
	}
	
	/*
	 * NICHT VERWENDEN
	 */
	public void zeichen()
	{
		//nocht nicht möglich
		
	}

}
