package funktionenHandler;



public class Funktion
{
	private Baum funktionsBaum;
	public Funktion(String funktion)
	{
		
		this.funktionsBaum = Baum.createBaum(Lexer.lexen(funktion));
		
	}
	
	public double berechneF�r(double x)
	{
		funktionsBaum.setVar(x);
		return funktionsBaum.getResult();
		
	}
	
	/*
	 * NICHT VERWENDEN
	 */
	public void zeichen()
	{
		//nocht nicht m�glich
		
	}

}
