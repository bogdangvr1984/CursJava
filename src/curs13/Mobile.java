package curs13;

public class Mobile extends Product{

	private int buyingPrice;
	private int vat;
	
	public Mobile(int buyingPrice, int vat) {
		setBuyingPrice(buyingPrice);
		setVat(vat);
		
	}
	
	
	@Override
	public int calculatePrice() {
		// TODO Auto-generated method stub
		return buyingPrice + vat;
	}


	public int getBuyingPrice() {
		return buyingPrice;
	}


	public void setBuyingPrice(int buyingPrice) {
		this.buyingPrice = buyingPrice;
	}


	public int getVat() {
		return vat;
	}


	public void setVat(int vat) {
		this.vat = vat;
	}

	
	
}
