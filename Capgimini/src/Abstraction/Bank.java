package Abstraction;

public class Bank {
private int BankID;
  public Bank()
  {
	  
  }
public Bank(int BankID) {
	super();
	this.BankID = BankID;
}
public int geteId() {
	return BankID;
}
public void seteId(int BankID) {
	this.BankID = BankID;
}
@Override
public String toString() {
	return "BankID [BankId=" + BankID + "]";
}
  
}
