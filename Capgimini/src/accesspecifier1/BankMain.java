package accesspecifier1;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			HDFCPune p=new HDFCPune(1,"gayatri",56000);
			System.out.println(p);
			HDFCPune p1=new HDFCPune();
			p1.setAccno(2);
			p1.setCustomername("ravi");
			System.out.println(p1.getAccno());
			System.out.println(p1.getCustomername());

		}
	}


