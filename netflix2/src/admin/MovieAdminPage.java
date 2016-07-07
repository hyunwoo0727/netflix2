package admin;

import java.util.List;

import movie.MovieBean;

/**
 * @date   :2016. 7. 7.
 * @author :HyunWoo Lee
 * @file   :MovieAdminPage.java
 * @story  :
*/

public class MovieAdminPage {
	private String searchWord;
	private List<MovieBean> list;
	
	public String getSearchWord() {
		return searchWord;
	}
	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}
	public List<MovieBean> getList() {
		return list;
	}
	public void setList(List<MovieBean> list) {
		this.list = list;
	}
}
