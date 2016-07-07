package movie;

import java.util.List;

/**
 * @date   :2016. 7. 7.
 * @author :HyunWoo Lee
 * @file   :CategoryPageService.java
 * @story  :
*/

public interface CategoryPageService {
	public List<MovieBean> getCategoryList(String category);
	public List<MovieBean> filterByGenre(String genre);
	public List<MovieBean> sortList(String criterion);
	public MovieBean showDetail(int serialNo);
}
