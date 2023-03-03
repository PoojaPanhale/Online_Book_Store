package accesspecifier1;

public class Ebill implements Bill {
	 private int billno;
	    private int noofunits;
	    private int costperunits;
	    
	    
	    

	   public Ebill()
	   {
		   
	   }


	
		public Ebill(int billno, int noofunits, int costperunits) {
		super();
		this.billno = billno;
		this.noofunits = noofunits;
		this.costperunits = costperunits;
	}

	    public int getBillno() {
			return billno;
		}


		public void setBillno(int billno) {
			this.billno = billno;
		}


		public int getNoofunits() {
			return noofunits;
		}


		public void setNoofunits(int noofunits) {
			this.noofunits = noofunits;
		}


		public int getCostperunits() {
			return costperunits;
		}


		public void setCostperunits(int costperunits) {
			this.costperunits = costperunits;
		}


@Override
	    public double calculateBill() {
	        // TODO Auto-generated method stub
	        return noofunits *costperunits;
	    }
	   
	    @Override
public String toString() {
	return "Ebill [billno=" + billno + ", noofunits=" + noofunits + ", costperunits=" + costperunits + "]";
}

		
	    @Override
	    public void display() {
	        System.out.println(" The EBill is=:"+calculateBill());
	        
	    }
	    
}
