package admin;

import java.util.List;

import payment.PaymentBean;

/**
 * @date   :2016. 7. 7.
 * @author :HyunWoo Lee
 * @file   :PaymentAdminService.java
 * @story  :
*/

public interface PaymentAdminService {
	public List<PaymentBean> list();
	public List<PaymentBean> findByWord(String searchWord);
	public void cancelPay(int paySeq);
}
