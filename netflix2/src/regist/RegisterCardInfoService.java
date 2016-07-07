package regist;

import member.MemberBean;
import payment.CardBean;

public interface RegisterCardInfoService {
	public boolean checkAllAgree();
	public boolean checkCardInform(CardBean cardBean);
	public void startMembership(MemberBean memBean);
}
