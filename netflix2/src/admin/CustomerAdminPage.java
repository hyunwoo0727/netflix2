package admin;

import java.util.List;

import customer.CustomerBean;

/**
 * @date   :2016. 7. 7.
 * @author :HyunWoo Lee
 * @file   :CustomerAdminPage.java
 * @story  :
*/

public class CustomerAdminPage {
	private List<CustomerBean> customList;
	private String searchWord;
	public List<CustomerBean> getCustomList() {
		return customList;
	}
	public void setCustomList(List<CustomerBean> customList) {
		this.customList = customList;
	}
	public String getSearchWord() {
		return searchWord;
	}
	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}
	
}
