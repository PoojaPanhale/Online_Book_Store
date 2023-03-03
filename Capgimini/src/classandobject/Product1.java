package classandobject;

public class Product1 {
	private int product1id;
	private String product1name;
	private int nooforders;
	
	public void setProduct1Id(int product1id)
	{
		this.product1id=product1id;
	}
	public int getProduct1Id()
	{
		return product1id;
	}
	
	public String getProduct1name() {
		return product1name;
	}
	public void setProduct1name(String product1name) {
		this.product1name = product1name;
	}
	public int getNooforders() {
		return nooforders;
	}
	public void setNooforders(int nooforders) {
		this.nooforders = nooforders;
	}
	@Override
	public String toString() {
		return "Product1 [product1id=" + product1id + ", product1name=" + product1name + ", nooforders=" + nooforders + "]";
	}
}

