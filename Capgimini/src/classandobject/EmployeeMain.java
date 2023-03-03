package classandobject;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.id=1001;
		emp.name="pooja";
		emp.salary=34000;
		System.out.println("The Employee id=:"+emp.id);
		System.out.println("The Employee name=:"+emp.name);
		System.out.println("The Employee salary=:"+emp.salary);
		System.out.println("Annual Salary=:"+emp.annualSalary());
		System.out.println("Pf=:"+emp.pf());
       
		Employee emp2=new Employee();
		emp2.id=1002;
		emp2.name="Anita";
		emp2.salary=39000;
		System.out.println("The Employee id=:"+emp2.id);
		System.out.println("The Employee name=:"+emp2.name);
		System.out.println("The Employee salary=:"+emp2.salary);
		System.out.println("Annual Salary=:"+emp2.annualSalary());
		System.out.println("Pf=:"+emp2.pf());
		
		
		Employee emp3=new Employee();
		emp3.id=1003;
		emp3.name="Samu";
		emp3.salary=38000;
		System.out.println("The Employee id=:"+emp3.id);
		System.out.println("The Employee name=:"+emp3.name);
		System.out.println("The Employee salary=:"+emp3.salary);
		System.out.println("Annual Salary=:"+emp3.annualSalary());
		System.out.println("Pf=:"+emp3.pf());


	}

}
