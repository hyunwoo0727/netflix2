package customer;

import java.util.List;

/**
 * @date   :2016. 7. 7.
 * @author :HyunWoo Lee
 * @file   :CustomerPage.java
 * @story  :
*/

public class CustomerPage {
	private String searchWord;
	private List<CustomerBean> customList;

	public String getSearchWord() {
		return searchWord;
	}

	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}

	public List<CustomerBean> getCustomList() {
		return customList;
	}

	public void setCustomList(List<CustomerBean> customList) {
		this.customList = customList;
	}
	
}
