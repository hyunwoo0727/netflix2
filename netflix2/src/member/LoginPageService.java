package member;

/**
 * @date   :2016. 7. 7.
 * @author :HyunWoo Lee
 * @file   :LoginPageService.java
 * @story  :
*/

public interface LoginPageService {
	public boolean checkPassword(MemberBean memBean);
	public void login(MemberBean memBean);
	public void joinMember();
}
