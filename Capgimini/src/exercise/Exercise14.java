package exercise;

public class Exercise14 {
	 public String name;
	 public long population;
	//defining the method of the class
	 public void display()
	 {
	 System.out.println("City name: " +name);
	 System.out.println("Population: " +population);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaring the objects of the class City
		 Exercise14 metro1,metro2;
		 //Instantiating the objects of the class using the new keyword
		 metro1 = new  Exercise14();
		 metro2 = new Exercise14();
		 metro1.name ="Mumbai";
		 metro1.population = 23409876;
		 System.out.println("Details of metro city 1:");
		 metro1.display(); //display() method is being invoked for the object metro1
		 metro2.name ="Pune";
		 metro2.population = 45874294;
		 System.out.println("Details of metro city 2:");
		 metro2.display(); //display() method is being invoked for the object metro2
	}

}

