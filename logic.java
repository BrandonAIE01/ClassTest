
public class logic {
	
	
	private double number_1;
	private double number_2;
	private char opr;
	
	
	public logic(double n1, double n2, char o)
	{
		number_1 = n1;
		number_2 = n2;
		opr = o;
	}
	
	public double calculation()
	{
		double answer = 0;
		
		//switch
		/*switch(opr)
		{
		case '+':
			answer = number_1 + number_2;
			break;
			
		case '-':
			answer = number_1 - number_2;
			break;
			
		case '*':
			answer = number_1 * number_2;
			break;
			
		case '/':
			answer = number_1 / number_2;
			break;			
		}
		
		return answer;*/
		
		//if statement
		if(opr == '+')
		{
			answer = number_1 + number_2;
		}
		else
			if(opr == '-')
			{
				answer = number_1 - number_2;
			}
			else
				if(opr == '*')
				{
					answer = number_1 * number_2;
				}
				else
					if(opr == '/')
					{
						answer = number_1 / number_2;
					}
		
		
		return answer;
	}

}
