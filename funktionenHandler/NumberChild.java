package funktionenHandler;

import java.util.ArrayList;

/*
 * Eine der Endklaseen eines Funktionsbaums.
 * Speichert eine Double Zahl.
 * Zum erzeugen ist die Methoed createNumberChild zu nutzen
 */
public class NumberChild extends Baum {
	
	double number;
	
	NumberChild(double number)	{
		super(null, null, null);
		this.number = number;
		
	}

	@Override
	double getResult()
	{
		return number;		
	}
	
	
	@Override
	void setVar(double var)
	{
		
	}

	static Baum createNumberChild(ArrayList<String> list) {
		
		double d = Double.parseDouble(list.get(0));
		
				
				
		return new NumberChild(d);
		
	}
	
}
