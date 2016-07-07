package admin;

import java.util.List;

/**
 * @date   :2016. 7. 7.
 * @author :HyunWoo Lee
 * @file   :StatsAdminPage.java
 * @story  :
*/

public class StatsAdminPage {
	private List<StatsBean> statsList;
	private String sordKeyword;

	public List<StatsBean> getStatsList() {
		return statsList;
	}

	public void setStatsList(List<StatsBean> statsList) {
		this.statsList = statsList;
	}

	public String getSordKeyword() {
		return sordKeyword;
	}

	public void setSordKeyword(String sordKeyword) {
		this.sordKeyword = sordKeyword;
	}
}
