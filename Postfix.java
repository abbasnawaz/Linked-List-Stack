public class  Postfix
{

	public static String convertToPostfix(String infix)
	{
		
		LinkedStack<Character> stack = new LinkedStack<Character>();
		StringBuilder exp = new StringBuilder();
		char c = ' ';
		
		for (int i = 0; i < infix.length(); i++)
		{
			c = infix.charAt(i);
			
			if(oper(c))
			{
				
				if(c =='(')
				{
					stack.push(c);
				}
				else if(c==')')
				{
					
					char stackTop = stack.pop();
					while(stackTop != '(')
					{
						exp.append(stackTop);
						stackTop = stack.pop();
					}
					
				}

				else
				{
				
					while(!stack.isEmpty() && !order(c, stack.peek()))
					{
						exp.append(stack.pop());
					}
					stack.push(c);
					
				}
				
				
			}
			else
			{
				 exp.append(c);
			}
		
		}
		
		while(!stack.isEmpty())
		{
			exp.append(stack.pop());
		}

		return exp.toString();
		
	}
	private static boolean oper(char c)
	{
		return c=='^'|| c=='*' || c=='/'|| c=='-' || c=='+' || c=='(' || c==')';
	}
	private static boolean order(char op1, char op2)
	{
		if((op1=='*' && op2=='+') ||
		(op1=='*' && op2=='-') ||
		(op1=='/' && op2=='+')||
		(op1=='/' && op2=='-')||
		(op1=='^' && op2=='+')||
		(op1=='^' && op2=='-')||
		(op1=='^' && op2=='*')||
		(op1=='^' && op2=='/')||
		(op2 =='('))
		{
			return true;
		}
		return false;	
		
	}
	
	public static int evalutePostfix(String postfix)
	{
		
		StackInterface<Integer> stack = new LinkedStack<Integer>();
		char ch = ' ';
		for(int i=0;i<postfix.length();i++)
		{
			ch=postfix.charAt(i);
			if(ch!='+'&&ch!='-'&&ch!='/'&&ch!='*'&&ch!='^')
			{
				stack.push((int)ch-'0');

			}
			else
			{
				if(ch=='^')
				{

					int oprand1=stack.pop();
					int oprand2=stack.pop();
					
					int result=solution(oprand2,oprand1,ch);
					
					stack.push(result);

				} 
				else
				{
					int oprand2 = stack.pop();
					int oprand1 = stack.pop();

					int result=solution(oprand1,oprand2,ch);
					stack.push(result);
				}
			}
		}
		return stack.peek();

	} 





	private static int solution(int one, int two, char op)
	{
		int data=0;

	   if(op =='^')
		{
			data=(int)Math.pow(one,two);
		}
	   
	    else if(op =='*')
		{
			data= one*two;
		}
		else if(op =='/')
		{
			data= one/two;
		}
		else if(op =='-')
		{
			data= one-two;
		}
		else if(op=='+')
		{
			data= one+two;
		}
		else
		{
			data= 0;
		}
		return data;
		
	}
}