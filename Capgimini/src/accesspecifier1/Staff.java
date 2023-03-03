package accesspecifier1;

public class Staff extends Person{
    int attendace;
    int Experince;
    String subject;
    public Staff()
    {
    	
    }
	public Staff(int id, String name, String address,int attendace, int experince, String subject) {
		super(id,name,address);
		this.attendace = attendace;
		Experince = experince;
		this.subject = subject;
	}
	public int getAttendace() {
		return attendace;
	}
	public void setAttendace(int attendace) {
		this.attendace = attendace;
	}
	public int getExperince() {
		return Experince;
	}
	public void setExperince(int experince) {
		Experince = experince;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Staff [attendace=" + attendace + ", Experince=" + Experince + ", subject=" + subject + "]";
	}
	
    
}
