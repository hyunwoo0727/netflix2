package payment;

import member.MemberBean;

/**
 * @date   :2016. 7. 7.
 * @author :HyunWoo Lee
 * @file   :CardPageService.java
 * @story  :
*/

public interface CardPageService {
	public CardBean getCardInfo(String email);
	public boolean checkCardInfo(CardBean cardBean);
	public void updateCardInfo(MemberBean memBean);
	public boolean checkAgree();
	
}
