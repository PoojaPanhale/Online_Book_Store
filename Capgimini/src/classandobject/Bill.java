package classandobject;

public class Bill {
	private int BillNo;
	private int noofunits;
	private int costperunit;
	private int calculate;
	 

	
	public void setBillNo(int BillNo)
	{
		this.BillNo=BillNo;
	}
	public int getBillNo()
	{
		return BillNo;
	}
	
	public double getnoofunits() {
		return noofunits;
	}
	public void setnoofunits(int noofunits) {
		this.noofunits = noofunits;
	}
	public int getcostperunit() {
		return costperunit;
	}
	public void setcostperunit(int costperunit) {
		this.costperunit =costperunit;
	
	}
	 
	public int getcalculate()
	{
		int calculate=noofunits*costperunit;
		return calculate;
	}
	public void setcalculate(int calculate)
	{
		this.calculate=calculate;
	}
	@Override
	public String toString() {
		return "Bill [BillNo=" + BillNo + ", noofunits=" + noofunits + ", costperunit=" + costperunit + ", calculate="
				+ calculate + "]";
	}

	
	
}
