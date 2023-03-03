package collation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("pooja", "satara", 24000);
		Employee e2=new Employee("acb", "wai", 29000);
		Employee e3=new Employee("anita", "phaltan", 28000);
		ArrayList<Employee>list=new ArrayList<Employee>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        System.out.println(list);
        salaryCalculation(list);
        System.out.println("=================");
        for(Employee e:list)
        {
      	  System.out.println(e);
        }
        System.out.println("=================sorting");
        Collections.sort(list);
        for(Employee e:list)
        {
      	  System.out.println(e);
        }
  	}
  	public static void salaryCalculation(List<Employee>list)
  	{
  		for(Employee e:list)
  		{
  			if(e.getSalary()>=50000)
  			{
  				System.out.println(e.geteName());
  			}
	}
	
	}

}
