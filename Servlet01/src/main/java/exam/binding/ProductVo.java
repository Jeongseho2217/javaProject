package exam.binding;

public class ProductVo {
	private String prdNo;
	private String prdName;
	private int prdPrice;
	private int prdStock;
	
	public ProductVo(String pNo, String pName, int pPrice, int pStock) {
		this.prdNo = pNo;
		this.prdName = pName;
		this.prdPrice = pPrice;
		this.prdStock = pStock;
	}
	
	public String getPrdNo() {
		return prdNo;
	}
	public void setPrdNo(String prdNo) {
		this.prdNo = prdNo;
	}
	public String getPrdName() {
		return prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	public int getPrdPrice() {
		return prdPrice;
	}
	public void setPrdPrice(int prdPrice) {
		this.prdPrice = prdPrice;
	}
	public int getPrdStock() {
		return prdStock;
	}
	public void setPrdStock(int prdStock) {
		this.prdStock = prdStock;
	}
}
