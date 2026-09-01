package exam.beans;

public class ProductVO {
	private String prdNo;
	private String prdName;
	private int prdPrice;
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

	public String getPrdCompany() {
		return prdCompany;
	}

	public void setPrdCompany(String prdCompany) {
		this.prdCompany = prdCompany;
	}

	private String prdCompany;
	
	public ProductVO() {
		
	}
	
	public ProductVO(String pNo, String pName, int pPrice, String pComp) {
		this.prdNo = pNo;
		this.prdName = pName;
		this.prdPrice = pPrice;
		this.prdCompany = pComp;
	}
	
}
