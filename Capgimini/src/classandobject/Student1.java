package classandobject;

public class Student1 {
	 private int id;
	private String name;
	 private String Address;
	 private double  percentage;
	 private double total;
	
   private float sub1;
  private  float sub2;
  private  float sub3;
  private  float sub4;
  private  float sub5;
    public Student1(int i,String s,String j,float a,float b,float c,float d,float e)
    {
    	id=i;
    	name=s;
    	Address=j;
    	sub1=a;
    	sub2=b;
    	sub3=c;
    	sub4=d;
    	sub5=e;
    	
    }
	
	
	  public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	

	public float getSub1() {
		return sub1;
	}


	public void setSub1(float sub1) {
		this.sub1 = sub1;
	}


	public float getSub2() {
		return sub2;
	}


	public void setSub2(float sub2) {
		this.sub2 = sub2;
}


	public float getSub3() {
		return sub3;
	}


	public void setSub3(float sub3) {
		this.sub3 = sub3;
	}


	public float getSub4() {
		return sub4;
	}


	public void setSub4(float sub4) {
		this.sub4 = sub4;
	}


	public float getSub5() {
		return sub5;
	}


	public void setSub5(float sub5) {
		this.sub5 = sub5;
	}


	double total()
	    {
	    	return (sub1+sub2+sub3+sub4+sub5);

	}
	    double percentage()
	    {
	    	return((total()/500)*100);
	    	
	    }


		@Override
		public String toString() {
			return "Student1 id=" + id + ", name=" + name + ", Address=" + Address + ", percentage=" + percentage
					+ ", total=" + total + ", sub1=" + sub1 + ", sub2=" + sub2 + ", sub3=" + sub3 + ", sub4=" + sub4
					+ ", sub5=" + sub5 + "";
		}
		
		
}
