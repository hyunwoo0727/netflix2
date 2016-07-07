package payment;

/**
 * @date   :2016. 7. 7.
 * @author :HyunWoo Lee
 * @file   :PaymentInfoPage.java
 * @story  :
*/

public class PaymentInfoPage {
	private String cardNum,payDate,expireDate;
	private int price;
	
	
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public String getPayDate() {
		return payDate;
	}
	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}
	public String getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
