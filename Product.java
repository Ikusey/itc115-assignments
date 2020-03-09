
public class Product {

	private int productCode;
	private int count;
	private double price;
	private String description;
	
	public Product(int productCode, int count, double price, String description) {
		this.productCode = productCode;
		this.count = count;
		this.price = price;
		this.description = description;
	}
	
	@Override
	public String toString() {
		return description + " [productCode=" + productCode + ", count=" + count + ", price=" + price
				+  "]";
	}

	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
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
