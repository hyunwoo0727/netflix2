package member;

/**
 * @date   :2016. 7. 7.
 * @author :HyunWoo Lee
 * @file   :ProfilePageService.java
 * @story  :
*/

public interface ProfilePageService {
	public MemberBean getProfile(String email);
	public void changeProfile(MemberBean memBean);
	public void cancel();	
}	
