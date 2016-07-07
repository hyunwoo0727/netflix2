package admin;

import java.util.List;

import payment.PaymentBean;

/**
 * @date   :2016. 7. 7.
 * @author :HyunWoo Lee
 * @file   :PaymentAdminPage.java
 * @story  :
*/

public class PaymentAdminPage {
	private List<PaymentBean> payList;
	
	public List<PaymentBean> getPayList() {
		return payList;
	}
	public void setPayList(List<PaymentBean> payList) {
		this.payList = payList;
	}
}
