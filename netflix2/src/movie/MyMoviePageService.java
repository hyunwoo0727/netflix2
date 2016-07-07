package movie;

/**
 * @date   :2016. 7. 7.
 * @author :HyunWoo Lee
 * @file   :MyMoviePageService.java
 * @story  :
*/

public interface MyMoviePageService {
	public void remove(int serialNo);// 즐겨찾기에서 삭제 
	public MovieBean showDetail(int serialNo);
}
