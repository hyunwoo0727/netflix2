package admin;

import java.util.List;

import movie.MovieBean;

/**
 * @date   :2016. 7. 7.
 * @author :HyunWoo Lee
 * @file   :MovieAdminService.java
 * @story  :
*/

public interface MovieAdminService {
	public MovieBean getMovie(int serialNo);
	public List<MovieBean> findByTitle(String title);
	public List<MovieBean> findByCategory(String category);
	public List<MovieBean> findByGenre(String genre);
	public List<MovieBean> list();
	public void delete(int serialNo);
	public void update(MovieBean mvBean);
}
