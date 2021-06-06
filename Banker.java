import java.util.List;
import java.util.Map;

public class Banker {
	
	private Map<Integer, BankAccount> accounts;
	private List<Transaction> transactions;
	
	public final static String helpString = 
		"EXIT exit from application\n" +
		"COMMANDS display the command list\n\n" +
		"LIST ACCOUNTS displays all accounts in system\n" +
		"LIST TRANSACTIONS displays all transactions in system\n\n" +
		"DETAILS <accno> displays all details about bank account\n" +
		"BALANCE <accno> displays the current balance of bank account\n\n" +
		"HISTORY <accno> displays all transactions involving an account\n" +
		"OUTGOING <accno> displays all transactions paid by account\n" +
		"INCOMING <accno> displays all transactions received by account\n\n" +
		"CREATE <first> <last> [<balance>] creates a bank account\n" +
		"RENAME <accno> <first> <last> renames a bank account\n\n" +
		"PAY <sender> <receiver> <amount> transfers money between account\n" +
		"TRANSACTION <id> displays the transaction details\n" +
		"CANCEL <id> makes a copy of the transaction with receiver/sender swapped\n\n" +
		"ARCHIVE <ledgerFile> <accountFile> stores the transaction history as a ledger\n" +
		"RECOVER <ledgerFile> <accountFile> restores a ledger\n\n" +
		"MERGE <accno …> transfers all funds from listed accounts into the first account\n\n" +
		"MAX displays the highest balance from all accounts\n" +
		"MIN displays the lowest balance from all accounts\n" +
		"MEAN displays the average balance\n" +
		"MEDIAN displays the median balance\n" +
		"TOTAL displays the amount of money stored by bank";
	
	/**
	* Constructor for the Banker administrative system.
	*/
	public Banker() {
		// TODO: implement this
	}
	
	/**
	* Displays the list of commands.
	*/
	public static void commands() {
		System.out.println(Banker.helpString);
	}
	
	/**
	* Displays the closing statement.
	*/
	public static void exit() {
		System.out.println("bye");
	}
	
	/**
	* Prints out all account numbers within system in numerical order.
	*/
	public void listAccounts() {
		// TODO: implement this
	}
	
	/**
	* Prints out all transaction details within system in chronological order.
	*/
	public void listTransactions() {
		// TODO: implement this
	}
	
	/**
	* Displays the account number, name and balance of an account.
	*
	* @param accNo		the account number
	*/
	public void details(int accNo) {
		// TODO: implement this
	}
	
	/**
	* Displays the current balance for a specified account.
	*
	* @param accNo		the account number
	*/
	public void balance(int accNo) {
		// TODO: implement this
	}
	
	/**
	* Displays the entire transaction history for a specified account.
	*
	* @param accNo		the account number
	*/
	public void history(int accNo) {
		// TODO: implement this
	}
	
	/**
	* Displays the outgoing transaction history for a specified account.
	*
	* @param accNo		the account number
	*/
	public void outgoing(int accNo) {
		// TODO: implement this
	}
	
	/**
	* Displays the incoming transaction history for a specified account.
	*
	* @param accNo		the account number
	*/
	public void incoming(int accNo) {
		// TODO: implement this
	}
	
	/**
	* Creates an account within the system.
	*
	* @param first		the first name of the person
	* @param last		the surname of the person
	* @param balance	the starting balance of the person
	*/
	public void createAccount(String first, String last, int balance) {
		// TODO: implement this
	}
	
	/**
	* Renames a specified account.
	*
	* @param accNo		the account number
	* @param first		the new first name
	* @param last		the new surname
	*/
	public void rename(int accNo, String first, String last) {
		// TODO: implement this
	}
	
	/**
	* Creates a transaction between two bank accounts.
	*
	* @param sender		the account number of the sender
	* @param receiver	the account number of the receiver
	* @param amount		the amount to be transferred
	*/
	public void pay(int sender, int receiver, int amount) {
		// TODO: implement this
	}
	
	/**
	* Displays the details for a specified transaction.
	*
	* @param id			the transaction ID
	*/
	public void transaction(int id) {
		// TODO: implement this
	}
	
	/**
	* Creates the reverse transaction to the one specified.
	*
	* @param id			the transaction id to be cancelled
	*/
	public void cancel(int id) {
		// TODO: implement this
	}
	
	/**
	* Saves ledger to file.
	*
	* @param ledgerFile		the name of the ledger file
	* @param accFile		the name of the accounts file
	*/
	public void archive(String ledgerFile, String accFile) {
		// TODO: implement this
	}
	
	/**
	* Restores archived ledger and accounts files to the system.
	*
	* @param ledgerFile		the name of the ledger file
	* @param accFile		the name of the accounts file
	*/
	public void recover(String ledgerFile, String accFile) {
		// TODO: implement this
	}
	
	/**
	* Transfers all funds into the destination account.
	*
	* @param dest		the account number for the destination account
	* @param others		the account numbers for the accounts to be merged
	*/
	public void merge(int dest, int[] others) {
		// TODO: implement this	
	}
	
	/**
	* Displays the lowest balance in the system.
	*/
	public void min() {
		// TODO: implement this
	}
	
	/**
	* Displays the highest balance in the system.
	*/
	public void max() {
		// TODO: implement this
	}
	
	/**
	* Displays the average balance in the system (rounded down).
	*/
	public void mean() {
		// TODO: implement this
	}
	
	/**
	* Displays the median balance in the system.
	*/
	public void median() {
		// TODO: implement this
	}
	
	/**
	* Displays the total balance for all accounts.
	*/
	public void total() {
		// TODO: implement this
	}
	
	public static void main(String[] args) {
		// TODO: Your main method here!
	}
	
}

