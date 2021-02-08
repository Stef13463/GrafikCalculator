package funktionenHandler;

public class VarChild extends Baum {
	
	double var;
	boolean set;
	
	VarChild()
	{
		super(null, null, null);		
		
		var = 0;
		set = false;
	}
	
	@Override
	double getResult()
	{	
		if(!set)System.out.println("Variable nicht gesetzt");
			
		return var;	
		
	}
	
	@Override
	void setVar(double var)
	{
		this.var = var;
		set = true;
		
	}

	static Baum createVarChild() {
		
		return new VarChild();
	}

}
