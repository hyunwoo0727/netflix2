package payment;

import java.util.List;

import member.MemberBean;

/**
 * @date   :2016. 7. 7.
 * @author :HyunWoo Lee
 * @file   :PaymentInfoService.java
 * @story  :
*/

public interface PaymentInfoService {
	public List<PaymentBean> getPayList(String cardNum);
	public void restartMembership(MemberBean memberBean);
	
}
