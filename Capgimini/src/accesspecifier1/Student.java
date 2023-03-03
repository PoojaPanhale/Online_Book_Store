package accesspecifier1;

public class Student extends Person {
     int attendace;
     int  totalmark;
     double percentage;
     public Student()
     {
    	 
     }
	public Student( int id,String name, String address,int attendace, int totalmark, double percentage) 
	{
		super(id,name,address);
		this.attendace = attendace;
		this.totalmark = totalmark;
		this.percentage = percentage;
	}
	public int getAttendace() {
		return attendace;
	}
	public void setAttendace(int attendace) {
		this.attendace = attendace;
	}
	public int getTotalmark() {
		return totalmark;
	}
	public void setTotalmark(int totalmark) {
		this.totalmark = totalmark;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [attendace=" + attendace + ", totalmark=" + totalmark + ", percentage=" + percentage + "]";
	}
     
}
