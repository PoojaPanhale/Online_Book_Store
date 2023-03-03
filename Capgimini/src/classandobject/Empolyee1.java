package classandobject;

public class Empolyee1 {
	private int id;
	private String name;
	private int salary;
	private int annualsalary;
	private float pf=0;
	public Empolyee1(int i ,String j,int k)//using constructor
	{
		id=i;
		name=j;
		salary=k;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	 double annualsalary()
	 {
		 return annualsalary=salary*12;
	 }
	 double pf()
	 {
		 return pf=(salary/100)*18;
	 }

	@Override
	public String toString() {
		return "Empolyee1 [id=" + id + ", name=" + name + ", salary=" + salary + ", annualsalary=" + annualsalary
				+ ", pf=" + pf + "]";
	}
	
}
