/***********************************************************************************
* This is a small project of an email application
* The Program shold be able to perform the following functions
 -> Generate an email with the following syntax: firstname.lastname@department.company.com
 -> Determine the department (sales, Accounting, developmement), if none leave department as "department"
 -> Generate a random string of password
 -> Have set methods to change the password, set a mailbox capacity, and define an alternate email addrress
 -> Have get methods to display name, email and mailbox capacity
* This program is consisting of two classes 
 ->EmailApllication
 ->EmailAppMain
* Let the company name be SOFTECH
 *************************************************************************************/
 package projects.Email;
 
 import java.util.Scanner;
 
 class EmailApllication{
	 private final int password_length = 10;
	 private String firstname;
	 private String lastname;
	 private String department;
	 private String password;
	 private String email;
	 private String company = "softech.com";
	 private int mailboxCapacity;
	 private String alternate_email;
	 
	 EmailApllication(String firstname, String lastname){
		 //getting first name and last name
		 this.firstname = firstname;
		 this.lastname = lastname;
		 System.out.println("New Employee: "+firstname+ " "+ lastname);
		 
		
		//getting the department assigned
		 this.department = getDepartment();
		 System.out.println("Department Assigned : "+department);
		 
       
	   //Assigning the email address
         this.email = this.firstname.toLowerCase()+"."+this.lastname.toLowerCase()+"@"+department+company;
		 System.out.println("Email Generated: "+email);        		
		
		
		//Creating a password
		this.password = setPassword(password_length);
		System.out.println("Password : "+password);
		
	 }
	 
	 //Method Get Department which will return the department of new employee
	 public String getDepartment(){
		 System.out.println("Department Codes:\n1->Sales\n2->Accounting\n3->Development");
		 System.out.println("Enter the department code");
		 Scanner s = new Scanner(System.in);
		 int choice = s.nextInt();
		 String deptAssigned;
		 switch(choice){
			 case 1:
			 deptAssigned = "sales";
			 break;
			 case 2:
			 deptAssigned = "accounting";
			 break;
			 case 3:
			 deptAssigned = "developmement";
			 break;
			 default:
			 deptAssigned = "department";
		 }
		 return deptAssigned;
	 }
	 
	 //This method will set the password (random String)
	 private String setPassword(int len){
		 String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%&";
		 char [] pass = new char[len];
		 for(int i=0;i<len;i++){
			 int rand = (int)(Math.random()*passwordSet.length());
			 pass[i] = passwordSet.charAt(rand); 
		 }
         return new String(pass);		 
	 }
	 
	 //This method will be setting the mailbox capacity
	 
	 
	 //This method will generate an alternate email
	 public void generateAlternateEmail(String alteremail){
		System.out.println("Alternate Email:- "+ alteremail);
	 }
	 
	 //This method will display Name, email, department and password;
	 public void showInfo(){
		 System.out.flush();
		 System.out.println("=========================================================");
		 System.out.println("\n=====================Employee Detail=====================");
		 System.out.println("|| Name :"+this.firstname+" "+this.lastname);
		 System.out.println("|| Department : "+this.department);
		 System.out.println("|| Email Assigned : "+this.email);
		 System.out.println("|| Password : "+this.password);
		 System.out.println("||");
		 System.out.println("=========================================================");
	 }
	 
	 //method for clearing the screen
 }
 
 
 class EmailAppMain{
	 public static void main(String [] args){
		 EmailApllication e1 = new EmailApllication("Neha", "Goyal");
		 //e1.generateAlternateEmail("abc@fgg.com");
		 EmailApllication e2 = new EmailApllication("Azad", "Ahmad");
		 EmailApllication e3 = new EmailApllication("Riya", "Ritsa");
		 e1.showInfo();
		 e2.showInfo();
		 e3.showInfo();
		 
	 }
 }