/*
 *this program demonstrates the concept of use of variables in an interface
 *Variables are implicitly treated as static and final
 *
*/

package Interface;

import java.util.Random;

interface VariablesIFace{
	int NO = 0;
	int YES = 1;
	int MAYBE = 2;
	int SOON = 3;
	int NEVER = 4;
}

class VariablesQuestions implements VariablesIFace{
	Random r = new Random();
	int ask(){
		int prob = (int) (100*r.nextDouble());
		if(prob<30)
			return NO;
		else if(prob<60)
			return MAYBE;
		else if(prob<75)
			return SOON;
		else if(prob<95)
			return YES;
		else return NEVER;
		}
}

class VariablesInterface implements VariablesIFace{
	static void answer(int res){
		switch(res){
			case NO:
			System.out.println("NO");
			break;
			case YES:
			System.out.println("YES");
			break;
			case SOON:
			System.out.println("SOON");
			break;
			case MAYBE:
			System.out.println("MAYBE");
			break;
			case NEVER:
			System.out.println("NEVER");
			break;
		}
	}
	
	public static void main(String [] a){
		VariablesQuestions q = new VariablesQuestions();
		for(int i=0;i<10;i++)
		answer(q.ask());
	}
	
}