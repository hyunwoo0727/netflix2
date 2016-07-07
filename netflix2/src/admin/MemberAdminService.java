package admin;

import java.util.List;

import member.MemberBean;

/**
 * @date   :2016. 7. 7.
 * @author :HyunWoo Lee
 * @file   :MemberAdminService.java
 * @story  :
*/

public interface MemberAdminService {
	public List<MemberBean> list();
	public List<MemberBean> searchMember(String searchWord);
	public void delete(String email);
	public MemberBean findById(String email);
	
}
