package funktionenHandler;

import java.util.ArrayList;

public class FunktionChild extends Baum {

	private Baum innerereWert;
	private FunktionsTyp typ;
	
	
	public FunktionChild(Baum innererWert, FunktionsTyp typ) 
	{
		super(null, null, null);
		this.innerereWert = innererWert;
		this.typ = typ;
		
	}
	
	@Override
	double getResult()
	{
		return typ.calc(innerereWert.getResult());
	}
	
	@Override
	void setVar(double var)
	{
		innerereWert.setVar(var);		
	}
	
	
	public Baum createFunktionChild(String string)
	{
		// string == "sin(4x + 3)" beispielsweise
		
		FunktionsTyp typ = FunktionsTyp.findeTyp(string);
		
		String innererWert_s = FunktionsTyp.findeInnerenWert(string); //innererWert_s = "4x + 3"
		
		ArrayList<String> innererWert_l = Lexer.lexen(innererWert_s); //innerereWert_l = ["4", "*", "x", "+", "3"]
		
		Baum b = Baum.createBaum(innererWert_l);
		
		return new FunktionChild(b, typ);		
			
		
	}

}
