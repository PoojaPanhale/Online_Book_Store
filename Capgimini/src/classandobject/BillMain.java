package classandobject;

public class BillMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bill b1=new Bill();
		b1.setBillNo(1001);
		b1.setnoofunits(27);
		b1.setcostperunit(56);
		System.out.println("Bill number:"+b1.getBillNo());
		System.out.println("no of units:"+b1.getnoofunits());
		System.out.println("cost per unit :"+b1.getcostperunit());
		System.out.println("bill amount:"+b1.getcalculate());
		System.out.println("================================================");
		 
		
		Bill b2=new Bill();
		b2.setBillNo(1002);
		b2.setnoofunits(35);
		b2.setcostperunit(27);
		System.out.println("Bill Number :"+b2.getBillNo());
		System.out.println("no of units :"+b2.getnoofunits());
		System.out.println("cost of perumits:"+b2.getcostperunit());
		System.out.println("bill amount:"+b2.getcalculate());
		System.out.println("================================================");
		 
	}

}
