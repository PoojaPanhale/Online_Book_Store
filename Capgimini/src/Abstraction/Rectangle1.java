package Abstraction;

public class Rectangle1 extends Shape1{

      double length;
      double width;
      public Rectangle1()
      {
    	  
      }
      public Rectangle1(double length, double width) {
  		
  		this.length = length;
  		this.width = width;
  	}
	public Rectangle1(String color, boolean filled,double length, double width) {
		super(color,filled);
		this.length = length;
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length*width;
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(length+width);
	}
	@Override
	public String toString() {
		return super.toString()+ "\nRectangle1 [length=" + length + ", width=" + width + ", getArea()=" + getArea() + ", getPerimeter()="
				+ getPerimeter() + "]";
	}
      

}
