package classandobject;

public class BillEx {
	private int BillNo;
	private int noofunits;
	private int costperunit;
	//private int calculate;
	 
public BillEx(int i,int j,int k)
{
	BillNo=i;
	 noofunits=j;
	costperunit=k;

	}

public int getBillNo() {
	return BillNo;
}

public void setBillNo(int billNo) {
	BillNo = billNo;
}

public int getNoofunits() {
	return noofunits;
}

public void setNoofunits(int noofunits) {
	this.noofunits = noofunits;
}

public int getCostperunit() {
	return costperunit;
}

public void setCostperunit(int costperunit) {
	this.costperunit = costperunit;
}



@Override
public String toString() {
	return "BillEx [BillNo=" + BillNo + ", noofunits=" + noofunits + ", costperunit=" + costperunit + "]";
}



}
