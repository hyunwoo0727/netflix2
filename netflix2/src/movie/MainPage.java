package movie;

import java.util.List;

/**
 * @date   :2016. 7. 7.
 * @author :HyunWoo Lee
 * @file   :MainPage.java
 * @story  :
*/

public class MainPage {
	// 상단부에 표시할 카테고리,검색어,프로필 이름 
	private String category,searchWord,name,id;
	// 메인 바디 
	private List<MovieBean> myMovieList,wishMovieList,hotMovieList,newMovieList;
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSearchWord() {
		return searchWord;
	}
	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<MovieBean> getMyMovieList() {
		return myMovieList;
	}
	public void setMyMovieList(List<MovieBean> myMovieList) {
		this.myMovieList = myMovieList;
	}
	public List<MovieBean> getWishMovieList() {
		return wishMovieList;
	}
	public void setWishMovieList(List<MovieBean> wishMovieList) {
		this.wishMovieList = wishMovieList;
	}
	public List<MovieBean> getHotMovieList() {
		return hotMovieList;
	}
	public void setHotMovieList(List<MovieBean> hotMovieList) {
		this.hotMovieList = hotMovieList;
	}
	public List<MovieBean> getNewMovieList() {
		return newMovieList;
	}
	public void setNewMovieList(List<MovieBean> newMovieList) {
		this.newMovieList = newMovieList;
	}
}
