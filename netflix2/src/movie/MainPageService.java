package movie;

import java.util.List;

import member.MemberBean;

/**
 * @date   :2016. 7. 7.
 * @author :HyunWoo Lee
 * @file   :MainPageService.java
 * @story  :
*/

public interface MainPageService {
	// top
	public void logout(String email);
	public void searchCategory(String category);
	public void search(String searchWord);
	public void showAlarm(String email);
	public void moveAccountPage(MemberBean memBean);
	
	// main 
	public List<MovieBean> getMyMovieList(String email);
	public List<MovieBean> getWishMovieList(String email);
	public List<MovieBean> getHotMovieList();
	public List<MovieBean> getNewMovieList();
	public MovieBean showDetail(int serialNo);
	public List<String> getImgList(int serialNo);
	public void playMovie(MovieBean mvBean);
}
