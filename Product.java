import java.text.NumberFormat;

public class Product {

	private String productCode;
	private int count;
	private double price;
	private String description;
	
	public Product(String productCode, int count, double price, String description) {
		this.productCode = productCode;
		this.count = count;
		this.price = price;
		this.description = description;
	}
	
	@Override
	public String toString() {
		return description + " [productCode= " + productCode + ", count= " + count + ", "
				+ "price= " + NumberFormat.getCurrencyInstance().format(this.price)
				+  "]";
	}
	
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int productCount) {
		this.count = productCount;
	}
	public double getPrice() {
		return price;
	}
	public void setProductPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
