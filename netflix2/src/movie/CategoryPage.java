package movie;

import java.util.List;

/**
 * @date   :2016. 7. 7.
 * @author :HyunWoo Lee
 * @file   :CategoryPage.java
 * @story  :
*/

public class CategoryPage {
	private String searchGenre,sort; // 카테고리 내 장르필터 , 정렬기준 
	private List<MovieBean> categoryList;
	public String getSearchGenre() {
		return searchGenre;
	}
	public void setSearchGenre(String searchGenre) {
		this.searchGenre = searchGenre;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public List<MovieBean> getCategoryList() {
		return categoryList;
	}
	public void setCategoryList(List<MovieBean> categoryList) {
		this.categoryList = categoryList;
	}
}
