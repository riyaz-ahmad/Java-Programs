import java.util.List;

public class Transaction {
	
	/**
	* Constructor for the Transaction class.
	*
	* @param id			the ID of the transaction
	* @param sender		the sending account
	* @param receiver	the receiving account
	* @param amount		the amount of money being transferred
	* @param prevHash	the hash of the previous transaction	
	*/
	public Transaction(int id, BankAccount sender, BankAccount receiver, int amount, String prevHash) {
		// TODO: implement this
	}
	
	/**
	* Returns the formatted string of the transaction.
	*
	* @return	the formatted String
	*/
	public String get() {
		// TODO: implement this
		return null;
	}
	
	/**
	* Verifies a list of transaction has not been tampered with. Returns true
	* if correct, false if invalid arguments or invalid hash chain.
	*
	* @param transactions	the list of transactions	
	* @return				the result of the verification
	*/
	public static boolean verify(List<Transaction> transactions) {
		// TODO: implement this
		return true;
	}
	
	/**
	* Returns the hash code for a transaction.
	*
	* @param id				the ID of the transaction
	* @param senderAccNo	the account number of the sender
	* @param receiverAccNo	the account number of the receiver
	* @param amount			the amount of money being transferred
	* @param prevHash		the hash of the previous transaction	
	* @return				the generated hash
	*/
	public static String generateHash(int id, int senderAccNo, int receiverAccNo, int amount, String prevHash) {
		
		String combined = id + "" + senderAccNo + "" + receiverAccNo + "" + amount + "" + prevHash;
		return combined.hashCode() + "";
		
	}
	
}

