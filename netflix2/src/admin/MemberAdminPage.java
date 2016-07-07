package admin;

import java.util.List;

import member.MemberBean;

/**
 * @date   :2016. 7. 7.
 * @author :HyunWoo Lee
 * @file   :MemberAdminPage.java
 * @story  :
*/

public class MemberAdminPage {
	private List<MemberBean> memList;
	private String searchWord,email;

	public List<MemberBean> getMemList() {
		return memList;
	}
	public void setMemList(List<MemberBean> memList) {
		this.memList = memList;
	}
	public String getSearchWord() {
		return searchWord;
	}
	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
