package Abstraction;

public class BankCity extends BankBranch{
  private String bankcity;
 

public BankCity( int BankID,String bankbranch,String bankcity) {
	setEname(bankbranch);
	getEname();
	this.bankcity = bankcity;
}


public String getEname() {
	return bankcity;
}


public void setEname(String bankcity) {
	this.bankcity = bankcity;
}


@Override
public String toString() {
	return "BankCity [bankcity=" + bankcity + "]";
}






}
