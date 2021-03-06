package xml_smt_trans;

import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Vitor
 *
 */
public class OperatorSet {
	
	
	public static final String AND = "∧";
	public static final String AND2 = "\u2227";
	public static final String OR = "∨";
	public static final String OR2 = "\u2228";
	public static final String IMPLIES = "\u21d2";
	public static final String IFF = "\u21d4";
	public static final String EXISTS = "\u2203";
	public static final String FORALL = "\u2200";
	public static final String LESS_OR_EQUAL = "\u2264";
	public static final String MORE_OR_EQUAL = "\u2265";
	public static final String SUBSET = "\u2282";
	public static final String SUBSETEQ = "\u2286";
	public static final String SUBSETEQ2 = "⊆";
	
	//Strings of relations
	public static final String RELATION = "\u2194";
	public static final String TOTAL_RELATION = "\ue100";
	public static final String SURJECTIVE_RELATION = "\ue101";
	public static final String TOTAL_SURJECTIVE_RELATION = "\ue102";
	public static final String PARTIAL_FUNCTION = "\u21f8";
	public static final String TOTAL_FUNCTION = "\u2192";
	public static final String PARTIAL_INJECTION = "\u2914";
	public static final String TOTAL_INJECTION = "\u21a3";
	public static final String PARTIAL_SURJECTION = "\u2900";
	public static final String TOTAL_SURJECTION = "\u21a0";
	public static final String BIJECTION = "\u2916";
	public static final String RELATION_OVERRIDING = "\ue103";
	public static final String RANGE_RESTRICTION = "\u25b7";
	public static final String RANGE_SUBTRACTION = "\u2a65";
	public static final String DOMAIN_RESTRICTION = "\u25c1";
	public static final String DOMAIN_SUBTRACTION = "\u2a64";	
	public static final String FORWARD_COMPOSITION = "\u003b";
	public static final String BACKWARD_COMPOSITION = "\u2218";
	public static final String TILDE = "\u223c";
	
	
	
	public static final String IN = "\u2208";
	public static final String UNION = "\u222a";
	public static final String INTER = "\u2229";
	public static final String RANGE = "‥";
	public static final String SETMINUS = "\u2216";
	public static final String CARTESIAN_PRODUCT = "×";
	public static final String CARTESIAN_PRODUCT2 = "\u00d7";
	public static final char MIDDLE_POINT = '·';
	public static final char MIDDLE_POINT2 = '\u00b7';
	public static final String PAIR_ARROW = "↦";
	public static final String MAPSTO = "\u21a6";
	public static final String MULTIPLICATION = "∗";
	public static final String DIVISION = "÷";	
	public static final char PONTO_E_VIRGULA = ';';
	public static final char TIO = '∼';
	public static final char VIRGULA = ',';
	public static final char COLCHETE_ABRE = '[';
	public static final char RETA_VERTICAL = '∣';	
	public static final String UNDEFINED_OPERATOR_14 = "age";	
	
	
	private final ArrayList<Triple<String, String,Integer>> stdCharMap = new ArrayList<Triple<String,String,Integer>>();
	private final ArrayList<Character> notImplementedSingleOperators = new ArrayList<Character>();
	private final ArrayList<String> notImplementedOperators = new ArrayList<String>();
	
	
	public OperatorSet()
	{		
		//Quem tem menos prioridade segue primeiro
		
		stdCharMap.add(new Triple<String,String,Integer>("dom","domain",4));
		stdCharMap.add(new Triple<String,String,Integer>("div", "/",6));
		stdCharMap.add(new Triple<String,String,Integer>(DIVISION, "/",6));
		stdCharMap.add(new Triple<String,String,Integer>("mod", "mod",6));
		stdCharMap.add(new Triple<String,String,Integer>(MULTIPLICATION, "*",6));
		stdCharMap.add(new Triple<String,String,Integer>("*", "*",6));
		stdCharMap.add(new Triple<String,String,Integer>("+", "+",7));
		stdCharMap.add(new Triple<String,String,Integer>("−", "-",7));
		stdCharMap.add(new Triple<String,String,Integer>(RANGE, "range",8));
		stdCharMap.add(new Triple<String,String,Integer>(CARTESIAN_PRODUCT,"cartesianproduct",9));
		stdCharMap.add(new Triple<String,String,Integer>(UNION, "union",10));
		stdCharMap.add(new Triple<String,String,Integer>(INTER, "inter",10));
		stdCharMap.add(new Triple<String,String,Integer>(SETMINUS, "setminus",10));
		stdCharMap.add(new Triple<String,String,Integer>("=", "=",12));
		stdCharMap.add(new Triple<String,String,Integer>("<", "<",12));
		stdCharMap.add(new Triple<String,String,Integer>(LESS_OR_EQUAL, "<=",12));
		stdCharMap.add(new Triple<String,String,Integer>(">", ">",12));
		stdCharMap.add(new Triple<String,String,Integer>(MORE_OR_EQUAL, ">=",12));
		stdCharMap.add(new Triple<String,String,Integer>(SUBSET, "subset",12));
		stdCharMap.add(new Triple<String,String,Integer>(SUBSETEQ, "subseteq",12));
		stdCharMap.add(new Triple<String,String,Integer>(SUBSETEQ2, "subseteq",12));
		stdCharMap.add(new Triple<String,String,Integer>(IN, "in",12));
		stdCharMap.add(new Triple<String,String,Integer>(AND, "and",13));
		stdCharMap.add(new Triple<String,String,Integer>(AND2, "and",13));
		stdCharMap.add(new Triple<String,String,Integer>(OR, "or",13));
		stdCharMap.add(new Triple<String,String,Integer>(OR2, "or",13));
		stdCharMap.add(new Triple<String,String,Integer>(IMPLIES, "implies",14));	
		stdCharMap.add(new Triple<String,String,Integer>(IFF, "iff",14));
		stdCharMap.add(new Triple<String,String,Integer>(EXISTS, "exists",15));
		stdCharMap.add(new Triple<String,String,Integer>(FORALL, "forall",15));
		stdCharMap.add(new Triple<String,String,Integer>("¬", "not",16));
		
		//Aplicando agora aos operadores de relação
		
		
		stdCharMap.add(new Triple<String,String,Integer>(MAPSTO,"pair",11));
		stdCharMap.add(new Triple<String,String,Integer>(TILDE,"inv",11));
		stdCharMap.add(new Triple<String,String,Integer>(BIJECTION,"bij",11));
		stdCharMap.add(new Triple<String,String,Integer>(TOTAL_SURJECTION,"tsur",11));
		stdCharMap.add(new Triple<String,String,Integer>(PARTIAL_SURJECTION,"psur",11));
		stdCharMap.add(new Triple<String,String,Integer>(TOTAL_INJECTION,"tinj",11));
		stdCharMap.add(new Triple<String,String,Integer>(PARTIAL_INJECTION,"pinj",11));
		stdCharMap.add(new Triple<String,String,Integer>(TOTAL_FUNCTION,"tfun",11));
		stdCharMap.add(new Triple<String,String,Integer>(PARTIAL_FUNCTION,"pfun",11));
		stdCharMap.add(new Triple<String,String,Integer>(RELATION,"rel",11));
		stdCharMap.add(new Triple<String,String,Integer>("id","id",11));
		stdCharMap.add(new Triple<String,String,Integer>(DOMAIN_RESTRICTION,"domr",11));
		stdCharMap.add(new Triple<String,String,Integer>(DOMAIN_SUBTRACTION,"doms",11));
		stdCharMap.add(new Triple<String,String,Integer>(RANGE_RESTRICTION,"ranr",11));
		stdCharMap.add(new Triple<String,String,Integer>(RANGE_SUBTRACTION,"rans",11));
		stdCharMap.add(new Triple<String,String,Integer>(RELATION_OVERRIDING,"ovr",11));
		stdCharMap.add(new Triple<String,String,Integer>(FORWARD_COMPOSITION,"comp",11));
	}
	
	public String toString()
	{
		return stdCharMap.toString();
	}
	
	public String getSMTOperator(String operator)
	{
		for(int i = 0 ; i < stdCharMap.size() ; i++)
		{
			if(operator.equals(stdCharMap.get(i).getFirstElement()))
			{
				return stdCharMap.get(i).getSecondElement();
			}
		}
		return null;
	}
	
	public boolean isNotImplementedOneLengthOperator(char t)
	{
		for(int i = 0 ; i < notImplementedSingleOperators.size() ; i++)
		{
			if(t == notImplementedSingleOperators.get(i))
			{
				return true;
			}
		}
		return false;
	}
	
	public static boolean isNewOperator(String x)
	{
		if( x.equals(RELATION) ||
			x.equals(TOTAL_RELATION) ||
			x.equals(SURJECTIVE_RELATION) ||
			x.equals(TOTAL_SURJECTIVE_RELATION) ||
			x.equals(PARTIAL_FUNCTION) ||
			x.equals(TOTAL_FUNCTION) ||
			x.equals(PARTIAL_INJECTION) ||
			x.equals(TOTAL_INJECTION) ||
			x.equals(TOTAL_SURJECTION) ||
			x.equals(BIJECTION) ||
			x.equals(RELATION_OVERRIDING) ||
			x.equals(RANGE_RESTRICTION) ||
			x.equals(RANGE_SUBTRACTION) ||
			x.equals(DOMAIN_RESTRICTION) ||
			x.equals(DOMAIN_SUBTRACTION) ||
			x.equals(FORWARD_COMPOSITION) ||
			x.equals(BACKWARD_COMPOSITION) ||
			x.equals(TILDE) ||
			x.equals("id")
			)
		{
			return true;
		}
		return false;	
	}
	
	public boolean isNotImplementedOperator(String t)
	{
		for(int i = 0 ; i < notImplementedOperators.size() ; i++)
		{
			if(t.equals(notImplementedOperators.get(i)))
			{
				return true;
			}
		}
		return false;
	}
	
	
	public boolean isOneLengthOperator(char t)
	{
		String c = String.valueOf(t);
		for(int i = 0 ; i < stdCharMap.size() ; i++ )
		{
			if (stdCharMap.get(i).getFirstElement().equals(c))
			{
				return true;
			}			
		}
		return false;		
	}
	
	public boolean isOperator(String operator)
	{
		for(int i = 0 ; i < stdCharMap.size() ; i++ )
		{
			if(operator.equals(stdCharMap.get(i).getFirstElement()))
			{
				return true;
			}
		}
		return false;
	}
	
	/**
	 * This method return the type of a operator, i.e., if a operator is binary or unary.
	 * @param operator The operator to be checked
	 * @return 2 if binary, 1 if unary.
	 */
	public static int operatorType(String operator)
	{
		if(operator.equals("¬") || operator.equals("dom") || operator.equals("domain"))// || operator.equals(TILDE))
		{
			return 1;
		}
		if(operator.equals(TILDE))
		{
			return 0;
		}
		return 2;
	}
	
	public int getPriority(String operator)
	{
		for(int i = 0 ; i < stdCharMap.size() ; i++ )
		{
			if(operator.equals(stdCharMap.get(i).getFirstElement()))
			{
				return stdCharMap.get(i).getThirdElement();
			}
		}
		return -1;
	}
	
	
	
	
	
	
	

}
