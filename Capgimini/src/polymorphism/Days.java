package polymorphism;

public enum Days {
	SUNDAY(0),
	MONDAY(1),
	TUESDAY(2),
	WEDNESDAY(3),
	THRUSDAY(4),
	FRIDAY(5),
	SATURDAY(6);
	//SUNDAY,
	int daysindex;
	Days (int daysindex)
	{
		this.daysindex=daysindex;
	}
	public int getDaysindex() {
		return daysindex;
	}
	public void setDaysindex(int daysindex) {
		this.daysindex = daysindex;
	}
	
}
