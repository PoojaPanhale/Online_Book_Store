package lambadaexp;

public class Product {
private int id;
private int price;
private String Name;
public Product()
{
	}
public Product(int id, int price, String name) {
	super();
	this.id = id;
	this.price = price;
	Name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
@Override
public String toString() {
	return "Product [id=" + id + ", price=" + price + ", Name=" + Name + "]";
}

}
