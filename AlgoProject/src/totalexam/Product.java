package totalexam;

public class Product implements Comparable<Product>{
	private String productName;
	private int productStock;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductStock() {
		return productStock;
	}
	public void setProductStock(int productStock) {
		this.productStock = productStock;
	}
	
	public Product(String pName, int pStock) {
		this.productName = pName;
		this.productStock = pStock;
	}
	
	public Product(String pName) {
		this(pName, 0);
	}
	
	public int getProduct(int quantity) { // 창고에서 물품 꺼내오기
		if (quantity > productStock) return -1; // 부족하면 음수 반환
		else { // 많거나 같다면 차감하고 가져오기
			productStock -= quantity;
			return productStock;
		}
	}
	
	@Override
	public String toString() {
		return productName + " : " + productStock;
	}
	@Override
	public int compareTo(Product o) { // 비교
		return this.productName.compareTo(o.productName);
	}
	
}
