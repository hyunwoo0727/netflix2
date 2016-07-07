package member;

/**
 * @date   :2016. 7. 7.
 * @author :HyunWoo Lee
 * @file   :AccountPageService.java
 * @story  :
*/

public interface AccountPageService {
	public MemberBean getMemberBean(String email);
	public void changeEmail(String email);
	public void changePassword(MemberBean memBean);
	public void changePhone(String email);
	public void changeCardInfo(MemberBean memBean);
	public void changeMemberGrade(MemberBean memBean);
	public void changeEmailRecv(MemberBean memBean);
}
