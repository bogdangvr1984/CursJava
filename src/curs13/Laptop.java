package curs13;

public class Laptop extends Product {
	
	private int buyingPrice;
	private int vat;
	private int adaos;
	
	
	public Laptop(int buyingPrice, int vat, int adaos) {
		setBuyinPrice(buyingPrice);
		setVat(vat);
		setAdaos(adaos);
	}

	@Override
	public int calculatePrice() {
		// TODO Auto-generated method stub
		return buyingPrice + vat + adaos;
	}

	public int getBuyinPrice() {
		return buyingPrice;
	}

	public void setBuyinPrice(int buyinPrice) {
		this.buyingPrice = buyinPrice;
	}

	public int getVat() {
		return vat;
	}

	public void setVat(int vat) {
		this.vat = vat;
	}

	public int getAdaos() {
		return adaos;
	}

	public void setAdaos(int adaos) {
		this.adaos = adaos;
	}
	
	

}
