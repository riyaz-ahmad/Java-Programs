import java.util.List;

public class BankAccount {
	
	public static final int DEFAULT = 10000;
	
	/**
	* Constructor for the BankAccount object
	*
	* @param accNo		the account number
	* @param first		the first name of the person
	* @param last		the surname of the person
	* @param balance	the starting balance of the account
	*/
	public BankAccount(int accNo, String first, String last, int balance) {
		// TODO: implement this
	}
	
	/**
	* Returns the formatted string of the account.
	*
	* @return	the formatted String
	*/
	public String details() {
		// TODO: implement this
		return null;
	}
	
	/**
	* Returns list of all transactions involving account. Returns null if no history
	*
	* @return	the transaction history
	*/
	public List<Transaction> history() {
		// TODO: implement this
		return null;
	}
	
	/**
	* Processes transaction by deducting/adding amount. Returns true if successful,
	* false if insufficient funds.
	*
	* @param transaction	the transaction to be processed
	* @return				the result of the transaction
	*/
	public boolean processTransaction(Transaction transaction) {
		// TODO: implement this
		return false;
	}
	
	/**
	* Returns list of transactions where account is sender. Returns null if none.
	*
	* @return 	the list of transactions
	*/
	public List<Transaction> outgoing() {
		// TODO: implement this
		return null;
	}
	
	/**
	* Returns list of transactions where account is receiver. Returns null if none.
	*
	* @return	the list of transactions
	*/
	public List<Transaction> incoming() {
		// TODO: implement this
		return null;
	}
	
	/**
	* Renames the account with new first and last name.
	* 
	* @param first		the new first name
	* @param last		the new surname
	*/
	public void rename(String first, String last) {
		// TODO: implement this
	}
	
	/**
	* Returns the largest balance in list of accounts. Returns -1 if empty or null.
	*
	* @param accounts	the list of accounts	
	* @return			the largest balance
	*/
	public static int findMax(List<BankAccount> accounts) {
		// TODO: implement this
		return -1;
	}
	
	/**
	* Returns the smallest balance in list of accounts. Returns -1 if empty or null.
	*
	* @param accounts	the list of accounts	
	* @return			the smallest balance
	*/
	public static int findMin(List<BankAccount> accounts) {
		// TODO: implement this
		return -1;
	}
	
	/**
	* Returns the average balance in list of accounts (rounded down). Returns -1 if empty or null.
	*
	* @param accounts	the list of accounts	
	* @return			the average balance
	*/
	public static int mean(List<BankAccount> accounts) {
		// TODO: implement this
		return -1;
	}
	
	/**
	* Returns the median balance in list of accounts. Returns -1 if empty or null.
	*
	* @param accounts	the list of accounts	
	* @return			the median balance
	*/
	public static int median(List<BankAccount> accounts) {
		// TODO: implement this
		return -1;
	}
	
	/**
	* Returns the total balance in list of accounts. Returns -1 if empty or null.
	*
	* @param accounts	the list of accounts	
	* @return			the total balance
	*/
	public static int totalBalance(List<BankAccount> accounts) {
		// TODO: implement this
		return -1;
	}
}

