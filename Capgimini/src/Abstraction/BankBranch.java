package Abstraction;

public class BankBranch extends Bank {
private String bankbranch;

public BankBranch()
{
	}

public BankBranch( int BankID,String bankbranch) {
	super( );
	seteId(BankID);
	geteId();
	this.bankbranch = bankbranch;
}

public String getEname() {
	return bankbranch;
}

public void setEname(String bankbranch) {
	this.bankbranch =bankbranch;
}

@Override
public String toString() {
	return super.toString()+ "BankBranch [bankbranch=" + bankbranch + "]";
}

}
