package banking;

/**
 * Abstract Account Holder.
 */
public abstract class AccountHolder {
    private int idNumber;
    
    /**
     * @param idNumber The holder unique ID.
     */
    protected AccountHolder(int idNumber) {
        // TODO: complete the constructor
        this.idNumber;
    }

    public int getIdNumber() {
        // TODO: complete the method
        if (this.idNumber <= 0) {
		    throw new RuntimeException("Invalid ID Number");
	    }
        return this.idNumber;
    }
}
