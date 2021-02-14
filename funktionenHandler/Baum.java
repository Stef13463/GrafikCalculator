package funktionenHandler;

import java.util.ArrayList;

/*
 * Die Klasse Baum ist dafür zuständig einen Binärbaum zu erzeugen
 * der die Datenstruktur einer Funktion aufehmen kann. Zum Erzeugen
 * muss die static Metode "createBaum" verwendet werden
 */
public class Baum {
	
	
	private Operator operator;
	private Baum left;
	private Baum right;
	
	
	Baum(Baum left, Baum right, Operator operator) {
		this.operator = operator;
		this.left = left;
		this.right = right;
	}
	
	
	double getResult()
	{
		return operator.calc(left.getResult(), right.getResult());		
	}
	
	
	void setVar(double var)
	{
		left.setVar(var);
		right.setVar(var);
		
	}
	
	
	/*
	 * Braucht als Input eine Zeichenkette, die vorher via Lexer gelext wurde.
	 * Erzeugt den Baum rekursiv. Als Endklassen des Baumes kommen NumberChild oder VarChild infrage.
	 * Die mathematischen Operatoren (*, + , - ...) werden als Typ von der Klasse Operator gespeichert.
	 */
	static Baum createBaum(ArrayList<String> zeichenListe)
	{
		//Abbruchbedienungen behandeln
		if(zeichenListe.size() == 1)			
		{			
			
			if(zeichenListe.get(0).equals("x"))
			{				
				return VarChild.createVarChild();				
			}
			if(Lexer.isDouble(zeichenListe.get(0)))
			{				
				return NumberChild.createNumberChild(zeichenListe);				
			}			
			
		}
		
		
		
		Baum leftChild = null;
		Baum rightChild = null;
		ArrayList<String> leftList = new ArrayList<>();
		ArrayList<String> rightList = new ArrayList<>();
	
		
		int opPos = Operator.findeOperator(zeichenListe); //eleminiert auch unnötige Klammern
		
		
		
		//Create Operator for Root
		Operator operator = new Operator(zeichenListe.get(opPos));
		
		
		//Create LeftList
		for(int i = 0; i < opPos; i++)
		{
			leftList.add(zeichenListe.get(i));
			
		}
		
		//Create RightList
		for(int i = opPos + 1; i < zeichenListe.size() ; i++)
		{
			rightList.add(zeichenListe.get(i));
			
		}
		
		
		
		
		leftChild = Baum.createBaum(leftList);
		rightChild = Baum.createBaum(rightList);
		
		
		Baum baum = new Baum(leftChild, rightChild, operator);
		
		return baum;
		
	}
	
	
	
}
