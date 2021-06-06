import java.util.*;

class Stack{
	
	//Declearing the top of stack
	private int top;
	private int data;
	private int n = 30;
	
	//Declearing an array to store the elements of stack
	private int arr[] = new int[n];
	//initialization of top of stack with -1 by calling the default constructor
	Stack(){
	top = -1;
	}
	
	//Method for inserting element into the stack
	public void push(int item){
		if(top>=n-1)
			System.out.println("Cannot insert--- Overflow");
		
		else{
			top++;
			arr[top] = item;
			System.out.println("ELement inserted "+arr[top]);
		}
		
	}
	
	//Method for removing the element from the stack
	public int pop(){
		
		if(top<=-1) System.out.println("Cannot pop-----underflow");
		else{
			data  = arr[top];
			top--;
			
		}
		return data;
	}
	
	
	//Method for displaying all the elements of a stack
	public void display(){
		if(top>=0){
			System.out.println("-----Elements of stack are----------");
			for(int i=top;i>-1;i--)
				System.out.print(arr[i]+"   ");
			
		}
		else
			System.out.println("Empty Stack");
		
	}
	
	//Method for counting the total number of elements in a stack
	public int countElements(){
		int c = 0;
		//System.out.println("-----Elements of stack are----------");
		if(top>=0){
			
			for(int i=top;i>-1;i--)
				c++;
			
		}
		else
			System.out.println("Empty Stack");
		
		return c;
	}
}

class Stack1{
	public static void main(String [] args){
		Stack s1 = new Stack();
		Scanner s = new Scanner(System.in);
		int choice;
		
		
		do{
		    System.out.println("\n=====================MENU=============================");
			System.out.println("1. Pushing the element into the stack");
			System.out.println("2. Popping the element from the stack");
			System.out.println("3. Display all elements of stack");
			System.out.println("4.COunt the number of elements");
			System.out.println("5. quit");
			System.out.println("======================================================\n");
			System.out.println("Enter your Choice: ");
			choice = s.nextInt();
			System.out.println("\n");
			if (choice == 5) {
				System.out.println("==================THANK YOU==========================");
				break;
			}
			switch(choice){
				case 1:
				System.out.println("Enter element you want to insert");
				int ele = s.nextInt();
				s1.push(ele);
				break;
				
				case 2:
				int el = s1.pop();
				System.out.println("Popped element is "+el);
				break;
				
				case 3:
				s1.display();
				
				break;
				
				case 4:
				int c = s1.countElements();
				System.out.println("Numberof elements "+c);
				break;
			
				default:
				System.out.println("Inavlid Input");
			}
		}while(true);
	}
}